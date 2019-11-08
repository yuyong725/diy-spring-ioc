package cn.javadog.diy.spring.ioc.beandefinition;

import cn.javadog.diy.spring.ioc.exception.BeanDefinitionStoreException;

/**
 * 定义 BeanDefinition 的增删改查
 * @author Sprite
 * @date 2019年11月07日 16:09:00
 */
public interface BeanDefinitionRegistry {

	void registerBeanDefinition(BeanDefinitionHolder beanDefinitionHolder)
		throws BeanDefinitionStoreException;

}
