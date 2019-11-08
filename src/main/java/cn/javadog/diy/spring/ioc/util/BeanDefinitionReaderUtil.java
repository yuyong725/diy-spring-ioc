package cn.javadog.diy.spring.ioc.util;

import cn.javadog.diy.spring.ioc.beandefinition.AbstractBeanDefinition;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionHolder;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionRegistry;
import cn.javadog.diy.spring.ioc.beandefinition.GenericBeanDefinition;

/**
 * @author Sprite
 * @date 2019年11月07日 21:37:00
 */
public class BeanDefinitionReaderUtil {

	/**
	 * 创建AbstractBeanDefinition，目前就一个属性
	 */
	public static AbstractBeanDefinition createBeanDefinition(String className) {
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClassName(className);
		return bd;
	}

	/**
	 * 注册bean
	 */
	public static void registerBeanDefinition(BeanDefinitionHolder beanDefinitionHolder, BeanDefinitionRegistry registry) {
		registry.registerBeanDefinition(beanDefinitionHolder);
	}

}
