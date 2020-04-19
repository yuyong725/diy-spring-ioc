package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:39:00
 * 循环依赖测试beanA
 */
public class CircleBeanA {

	public CircleBeanA() {
		System.out.println("CircleBeanA 构造，此时 circleBeanB 是否为空？" + (circleBeanB == null));
	}

	private CircleBeanB circleBeanB;

	public CircleBeanB getCircleBeanB() {
		return circleBeanB;
	}

	public void setCircleBeanB(CircleBeanB circleBeanB) {
		this.circleBeanB = circleBeanB;
	}
}
