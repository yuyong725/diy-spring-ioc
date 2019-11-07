package cn.javadog.diy.spring.ioc.beanfactory;

import cn.javadog.diy.spring.ioc.exception.BeansException;

/**
 * @author Sprite
 * @date 2019年11月07日 12:01:00
 * TODO 相关实现，部分实现可以抽离到子类
 */
public abstract class DefaultListableBeanFactory implements AutowireCapableBeanFactory,
	ListableBeanFactory, ConfigurableBeanFactory {
	@Override
	public Object getBean(String name) throws BeansException {
		return null;
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
		return false;
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
}
