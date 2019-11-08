package cn.javadog.diy.spring.ioc;

import cn.javadog.diy.spring.ioc.beanfactory.BeanFactory;
import cn.javadog.diy.spring.ioc.beanfactory.XmlBeanFactory;
import cn.javadog.diy.spring.ioc.resource.ClassPathResource;

/**
 * @author Sprite
 * @date 2019年11月07日 15:25:00
 */
public class BeanFactoryTest {

	public static void main(String[] args) throws Exception {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanTest.xml"));
		boolean containsBean = factory.containsBean("a");
		System.out.println(containsBean);
		DogBean bean = (DogBean) factory.getBean("a");
		bean.say();
	}

}
