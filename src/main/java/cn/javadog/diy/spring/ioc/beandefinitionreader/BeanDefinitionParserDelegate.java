package cn.javadog.diy.spring.ioc.beandefinitionreader;

import cn.javadog.diy.spring.ioc.beandefinition.AbstractBeanDefinition;
import cn.javadog.diy.spring.ioc.beandefinition.BeanDefinitionHolder;
import cn.javadog.diy.spring.ioc.util.BeanDefinitionReaderUtil;
import org.w3c.dom.Element;

/**
 * bean xml读取工具类
 * @author Sprite
 * @date 2019年11月07日 20:45:00
 */
public class BeanDefinitionParserDelegate {

	public static final String ID_ATTRIBUTE = "id";
	public static final String CLASS_ATTRIBUTE = "class";

	/**
	 * 将xml的信息解析到BeanDefinitionHolder
	 * 1、beanName的唯一 note 此处无视别名
	 * 2、xml的解析
	 */
	public BeanDefinitionHolder processBeanDefinitionElement(Element ele) {
		String beanName = ele.getAttribute(ID_ATTRIBUTE).trim();
		String classAttr = ele.getAttribute(CLASS_ATTRIBUTE).trim();

		AbstractBeanDefinition bd = BeanDefinitionReaderUtil.createBeanDefinition(classAttr);
		return new BeanDefinitionHolder(bd, beanName);
	}


}
