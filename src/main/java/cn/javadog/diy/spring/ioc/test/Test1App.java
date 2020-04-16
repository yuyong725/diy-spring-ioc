package cn.javadog.diy.spring.ioc.test;

import cn.javadog.diy.spring.ioc.test.applicationcontext.MyApplicationContext;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanA;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 余勇
 * @date 2020年04月15日 17:46:00
 */
public class Test1App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyApplicationContext("test1.xml");

		SimpleBeanB simpleBeanB = applicationContext.getBean(SimpleBeanB.class);
		System.out.println(simpleBeanB.getName());

		SimpleBeanA simpleBeanA = applicationContext.getBean(SimpleBeanA.class);
		System.out.println(simpleBeanA.getName());
	}

}
