package cn.javadog.diy.spring.ioc.beandefinitionreader;


import cn.javadog.diy.spring.ioc.exception.BeanDefinitionStoreException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author Sprite
 * @date 2019年11月07日 16:48:00
 */
public class DefaultBeanDefinitionDocumentReader implements BeanDefinitionDocumentReader {


	public static final String BEANS_ELEMENT = "beans";
	public static final String BEAN_ELEMENT = "bean";

	@Override
	public void registerBeanDefinitions(Document doc) throws BeanDefinitionStoreException {
		Element root = doc.getDocumentElement();
		parseBeanDefinitions(root);
	}

	/**
	 * 解析xml
	 * NOTE 暂时只处理 beans,不对xml格式做校验 2019/11/07
	 * TODO 做的更通用
	 */
	private void parseBeanDefinitions(Element root) {
		if (BEANS_ELEMENT.equals(root.getTagName())){
			NodeList childNodes = root.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node node = childNodes.item(i);
				if (node instanceof Element){
					Element ele = (Element) node;
					if (BEAN_ELEMENT.equals(ele.getTagName())){
						processBeanDefinition(ele);
					}
				}
			}
		}
	}

	/**
	 * 解析 baseScanPackage 节点
	 */
	private void processBeanDefinition(Element ele) {

	}
}
