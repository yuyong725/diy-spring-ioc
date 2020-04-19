package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:35:00
 *
 * 简单的beanA
 * 属性没有初始值，通过xml设置
 */
public class SimpleBeanA {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void initMethod() {
		System.out.println("SimpleBeanA's init");
	}

}
