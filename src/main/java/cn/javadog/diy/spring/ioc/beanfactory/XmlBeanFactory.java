package cn.javadog.diy.spring.ioc.beanfactory;


import cn.javadog.diy.spring.ioc.beandefinitionreader.XmlBeanDefinitionReader;
import cn.javadog.diy.spring.ioc.exception.BeansException;
import cn.javadog.diy.spring.ioc.resource.Resource;

/**
 * @author Sprite
 * @date 2019年11月07日 15:26:00
 * TODO 通过class路径匹配的beanfactory
 */
public class XmlBeanFactory extends DefaultListableBeanFactory {

	/**
	 * 用于将 资源文件 转换成 BeanDefinition
	 */
	private final XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader();

	public XmlBeanFactory(Resource resource) throws BeansException {
		this.reader.loadBeanDefinitions(resource);
	}


}
