package cn.javadog.diy.spring.ioc.test.bean;


/**
 * @author 余勇
 * @date 2020-04-19 15:02
 */
public interface AdvancedBeanF {

	default void testAop() {
		System.out.println("AdvancedBeanF testAop");
	}

	AdvancedBeanA getBean();
}
