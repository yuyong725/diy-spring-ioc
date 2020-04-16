package cn.javadog.diy.spring.ioc.beanfactory;

/**
 * 单例bean的注册
 * @author Sprite
 * @date 2019年11月07日 11:34:00
 */
public interface SingletonBeanRegistry {

	/**
	 * 使用指定 名称 将指定 实例 注册到容器中
	 */
	void registerSingleton(String beanName, Object singletonObject);

	/**
	 * 从容器中获取指定 名称 的 实例
	 */
	Object getSingleton(String beanName);

	/**
	 * 判断容器中是否包含指定 名称 的 实例
	 */
	boolean containsSingleton(String beanName);
}
