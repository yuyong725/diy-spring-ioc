package cn.javadog.diy.spring.ioc.beandefinitionreader;


import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionRegistry;
import cn.javadog.diy.spring.ioc.resource.Resource;
import org.w3c.dom.Document;

/**
 * @author Sprite
 * @date 2019年11月07日 14:05:00
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

	private DocumentLoader documentLoader = new DefaultDocumentLoader();
	private BeanDefinitionDocumentReader beanDefinitionDocumentReader = new DefaultBeanDefinitionDocumentReader();

	public XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
		super(registry);
	}


	public void loadBeanDefinitions(Resource resource) throws Exception {
		// TODO 加载beanDefinition的核心逻辑
		doLoadBeanDefinitions(resource);
	}

	public void doLoadBeanDefinitions(Resource resource) throws Exception {
		// TODO 加载beanDefinition的核心逻辑
		Document doc = this.documentLoader.loadDocument(resource);
		registerBeanDefinitions(doc);
	}

	private void registerBeanDefinitions(Document doc) {
		this.beanDefinitionDocumentReader.registerBeanDefinitions(doc, this.getRegistry());
	}


}
