package cn.javadog.diy.spring.ioc.beandefinitionreader;

import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionRegistry;
import cn.javadog.diy.spring.ioc.exception.BeanDefinitionStoreException;
import org.w3c.dom.Document;

/**
 * 定义读取document并注册BeanDefinition的功能
 * @author Sprite
 * @date 2019年11月07日 14:02:00
 */
public interface BeanDefinitionDocumentReader {

	void registerBeanDefinitions(Document doc, BeanDefinitionRegistry registry)
		throws BeanDefinitionStoreException;

}
