package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月16日 12:53:00
 */
public abstract class AdvancedBeanC {

	public void showMe() {
		this.getBean().showMe();
	}

	public abstract AdvancedBeanA getBean();

	public void changeMe() {
		System.out.println("AdvancedBeanC changeMe");
	}
}
