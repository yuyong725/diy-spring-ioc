package cn.javadog.diy.spring.ioc.beandefinitionreader;


import cn.javadog.diy.spring.ioc.resource.Resource;
import org.w3c.dom.Document;

/**
 * @author Sprite
 * @date 2019年11月07日 14:05:00
 */
public class XmlBeanDefinitionReader {

	private DocumentLoader documentLoader = new DefaultDocumentLoader();

	public void loadBeanDefinitions(Resource resource) {
		// TODO 加载beanDefinition的核心逻辑
		doLoadBeanDefinitions(resource);
	}

	public void doLoadBeanDefinitions(Resource resource) {
		// TODO 加载beanDefinition的核心逻辑
		Document doc = this.documentLoader.loadDocument(resource);
		registerBeanDefinitions(doc);
	}

	private void registerBeanDefinitions(Document doc) {
		BeanDefinitionDocumentReader documentReader = new DefaultBeanDefinitionDocumentReader();
		documentReader.registerBeanDefinitions(doc);
	}


}
