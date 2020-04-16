package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:35:00
 *
 * 简单的bean
 * 属性有初始值
 */
public class SimpleBeanB {

	private String name = "SimpleBeanB's name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
