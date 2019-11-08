package cn.javadog.diy.spring.ioc.beandefinitionreader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import cn.javadog.diy.spring.ioc.resource.Resource;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * @author Sprite
 * @date 2019年11月07日 16:21:00
 */
public class DefaultDocumentLoader implements DocumentLoader {


	@Override
	public Document loadDocument(Resource resource) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = factory.newDocumentBuilder();
		return docBuilder.parse(new InputSource(resource.getInputStream()));
	}
}
