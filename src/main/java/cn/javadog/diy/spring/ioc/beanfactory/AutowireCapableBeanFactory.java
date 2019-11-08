package cn.javadog.diy.spring.ioc.beanfactory;

/**
 * 定义autowire自动装配功能的相关方法
 * @author Sprite
 * @date 2019年11月07日 11:48:00
 * TODO 相关方法声明
 */
public interface AutowireCapableBeanFactory extends BeanFactory{

	/**
	 * 标示 根据名称自动装配
	 */
	int AUTOWIRE_BY_NAME = 1;

	/**
	 * 标示 根据类型自动装配
	 */
	int AUTOWIRE_BY_TYPE = 2;

}
