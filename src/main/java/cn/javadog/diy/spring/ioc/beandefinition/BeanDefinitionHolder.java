package cn.javadog.diy.spring.ioc.beandefinition;

/**
 * BeanDefinition 持有类，包含一些基本的BeanDefinition的属性
 * @author Sprite
 * @date 2019年11月07日 20:49:00
 */
public class BeanDefinitionHolder {

	private final BeanDefinition beanDefinition;

	private final String beanName;

	public BeanDefinitionHolder(BeanDefinition beanDefinition, String beanName) {
		this.beanDefinition = beanDefinition;
		this.beanName = beanName;
	}

	public String getBeanName(){
		return this.beanName;
	}

	public BeanDefinition getBeanDefinition() {
		return this.beanDefinition;
	}

}
