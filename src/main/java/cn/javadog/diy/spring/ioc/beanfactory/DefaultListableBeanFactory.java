package cn.javadog.diy.spring.ioc.beanfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.javadog.diy.spring.ioc.ObjectFactory;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinition;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionHolder;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionRegistry;
import cn.javadog.diy.spring.ioc.beandefinition.RootBeanDefinition;
import cn.javadog.diy.spring.ioc.exception.BeanCreationException;
import cn.javadog.diy.spring.ioc.exception.BeanDefinitionOverrideException;
import cn.javadog.diy.spring.ioc.exception.BeanDefinitionStoreException;
import cn.javadog.diy.spring.ioc.exception.BeansException;

/**
 * @author Sprite
 * @date 2019年11月07日 12:01:00
 * TODO 相关实现，部分实现可以抽离到子类
 */
public abstract class DefaultListableBeanFactory implements AutowireCapableBeanFactory,
	ListableBeanFactory, ConfigurableBeanFactory, BeanDefinitionRegistry {

	/**
	 * BeanDefinition 定义，键是bean的名称
	 */
	private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);

	/**
	 * 已注册的BeanDefinition的名称，按照注册的顺序
	 */
	private volatile List<String> beanDefinitionNames = new ArrayList<>(256);

	/**
	 * 获取bean实例的实现
	 * FIXME 暂时不考虑任何并发的可能性
	 */
	private Object  doGetBean(final String name) throws BeansException {
		final RootBeanDefinition rbd = getMergeLocalBeanDefinition(name);
		Object singleton = getSingleton(name, () -> createBean(name, rbd));
		return singleton;
	}

	/**
	 * NOTE 之所以一层一层的嵌套调用，是为了后续留口子
	 */
	private Object createBean(String beanName, RootBeanDefinition rbd) {
		return createBeanInstance(beanName, rbd);
	}

	protected Object createBeanInstance(String beanName, RootBeanDefinition rbd) {
		return instantiateBean(beanName, rbd);
	}

	protected Object instantiateBean(final String beanName, final RootBeanDefinition mbd) {
		try {
			final Class clazz = mbd.getBeanClass();
			Object beanInstance = clazz.getDeclaredConstructor((Class[])null).newInstance();
			return beanInstance;
		}
		catch (Throwable ex) {
			throw new BeanCreationException(beanName + " Instantiation of bean failed");
		}
	}
	/**
	 * 获取单例的bean
	 * FIXME 缓存、前置|后置 处理
	 */
	private Object getSingleton(String beanName, ObjectFactory<?> singletonFactory) {
		Object singletonObject = singletonFactory.getObject();
		return singletonObject;
	}

	/**
	 * 将xml中的GenericBeanDefinition转换为RootBeanDefinition
	 */
	private RootBeanDefinition getMergeLocalBeanDefinition(String name) {
		BeanDefinition beanDefinition = beanDefinitionMap.get(name);
		return new RootBeanDefinition(beanDefinition);
	}

	@Override
	public Object getBean(String name) throws BeansException {
		return doGetBean(name);
	}

	@Override
	public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		return null;
	}

	@Override
	public Object getBean(String name, Object... args) throws BeansException {
		return null;
	}

	@Override
	public <T> T getBean(Class<T> requiredType) throws BeansException {
		return null;
	}

	@Override
	public <T> T getBean(Class<T> requiredType, Object... args) throws BeansException {
		return null;
	}

	@Override
	public boolean containsBean(String name) {
		return this.beanDefinitionMap.containsKey(name);
	}

	@Override
	public void registerSingleton(String beanName, Object singletonObject) {

	}

	@Override
	public Object getSingleton(String beanName) {
		return null;
	}

	@Override
	public boolean containsSingleton(String beanName) {
		return false;
	}


	@Override
	public void registerBeanDefinition(BeanDefinitionHolder beanDefinitionHolder)
		throws BeanDefinitionStoreException {
		BeanDefinition beanDefinition = beanDefinitionHolder.getBeanDefinition();
		String beanName = beanDefinitionHolder.getBeanName();

		synchronized (this.beanDefinitionMap){
			BeanDefinition existingDefinition = this.beanDefinitionMap.get(beanName);
			if (existingDefinition != null) {
				throw new BeanDefinitionOverrideException();
				// NOTE 完整的Spring会去考虑是否允许bean覆盖等
			}else {
				this.beanDefinitionNames.add(beanName);
				this.beanDefinitionMap.put(beanName, beanDefinition);
			}
		}
	}
}
