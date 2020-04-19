package cn.javadog.diy.spring.ioc.test;

import cn.javadog.diy.spring.ioc.test.applicationcontext.MyApplicationContext;
import cn.javadog.diy.spring.ioc.test.bean.AdvancedBeanC;
import cn.javadog.diy.spring.ioc.test.bean.CircleBeanA;
import cn.javadog.diy.spring.ioc.test.bean.CircleBeanB;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanA;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanB;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanC;
import cn.javadog.diy.spring.ioc.test.bean.SimpleBeanD;
import cn.javadog.diy.spring.ioc.test.event.MyEvent;
import org.springframework.context.ApplicationContext;

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

		SimpleBeanC simpleBeanC = applicationContext.getBean(SimpleBeanC.class);
		System.out.println(simpleBeanC.getName());

		SimpleBeanD simpleBeanD = applicationContext.getBean(SimpleBeanD.class);
		System.out.println(simpleBeanD.toString());

		AdvancedBeanC advancedBeanC = applicationContext.getBean(AdvancedBeanC.class);
		advancedBeanC.showMe();
		advancedBeanC.changeMe();

		applicationContext.publishEvent(new MyEvent("hello", "msg"));

		CircleBeanA circleBeanA = applicationContext.getBean(CircleBeanA.class);
		System.out.println("实例后CircleBeanA的属性CircleBeanB是否为空？" + (circleBeanA.getCircleBeanB() == null));

		CircleBeanB circleBeanB = applicationContext.getBean(CircleBeanB.class);
		System.out.println("实例后CircleBeanA的属性CircleBeanB是否为空？" + (circleBeanB.getCircleBeanA() == null));
	}

}
