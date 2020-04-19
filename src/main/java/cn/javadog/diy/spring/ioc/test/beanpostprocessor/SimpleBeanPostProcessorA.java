package cn.javadog.diy.spring.ioc.test.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 余勇
 * @date 2020年04月18日 15:23:00
 */
public class SimpleBeanPostProcessorA implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SimpleBeanPostProcessorA 前置处理");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("SimpleBeanPostProcessorA 后置处理");
		return null;
	}
}
