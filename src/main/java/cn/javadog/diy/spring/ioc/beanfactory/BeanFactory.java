package cn.javadog.diy.spring.ioc.beanfactory;

import cn.javadog.diy.spring.ioc.exception.BeansException;

/**
 * bean工厂顶级接口，定义一些获取bean实例的方法
 * @author Sprite
 * @date 2019年11月07日 10:37:00
 */
public interface BeanFactory {


	/**
	 * 根据 名称 获取bean
	 */
	Object getBean(String name) throws BeansException;

	/**
	 * 根据 名称+返回类型 获取指定类型的bean
	 */
	<T> T getBean(String name, Class<T> requiredType) throws BeansException;

	/**
	 * 根据 名称+构造参数值 获取bean
	 */
	Object getBean(String name, Object... args) throws BeansException;

	/**
	 * 根据 类型 获取指定类型的bean
	 */
	<T> T getBean(Class<T> requiredType) throws BeansException;

	/**
	 * 根据 返回类型+构造参数值 获取指定类型的bean
	 */
	<T> T getBean(Class<T> requiredType, Object... args) throws BeansException;

	/**
	 * 容器中是否存在 指定名称 的bean
	 */
	boolean containsBean(String name);

}
