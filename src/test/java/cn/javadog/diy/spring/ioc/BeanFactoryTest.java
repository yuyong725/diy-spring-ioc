package cn.javadog.diy.spring.ioc;

import cn.javadog.diy.spring.ioc.beanfactory.BeanFactory;
import cn.javadog.diy.spring.ioc.beanfactory.XmlBeanFactory;

/**
 * @author Sprite
 * @date 2019年11月07日 15:25:00
 */
public class BeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(null);
	}

}
