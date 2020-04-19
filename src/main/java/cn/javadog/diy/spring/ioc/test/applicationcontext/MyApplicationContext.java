package cn.javadog.diy.spring.ioc.test.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 余勇
 * @date 2020年04月15日 21:07:00
 */
public class MyApplicationContext extends ClassPathXmlApplicationContext {

	public MyApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}

	/**
	 * 此方法搭配即将调用的 getEnvironment().validateRequiredProperties(); 能够用于验证系统参数
	 */
	@Override
	protected void initPropertySources() {
		// 系统环境必须包含的变量
		getEnvironment().setRequiredProperties("KAFKA_HOME");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		setAllowBeanDefinitionOverriding(false);
		setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);
	}
}
