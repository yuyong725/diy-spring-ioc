package cn.javadog.diy.spring.ioc.beandefinition;

/**
 * @author Sprite
 * @date 2019年11月07日 12:07:00
 */
public interface BeanDefinition extends AttributeAccessor {

	void setBeanClassName(String beanClassName);

	String getBeanClassName();

}
