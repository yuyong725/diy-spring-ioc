package cn.javadog.diy.spring.ioc.beandefinitionreader;

import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionRegistry;
import cn.javadog.diy.spring.ioc.resourceloader.ResourceLoader;

/**
 * 对BeanDefinitionReader、EnvironmentCapable定义的功能进行实现
 * @author Sprite
 * @date 2019年11月07日 13:56:00
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader,
		EnvironmentCapable{

	private final BeanDefinitionRegistry registry;

	protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
		this.registry = registry;
	}

	public BeanDefinitionRegistry getRegistry() {
		return this.registry;
	}

}
