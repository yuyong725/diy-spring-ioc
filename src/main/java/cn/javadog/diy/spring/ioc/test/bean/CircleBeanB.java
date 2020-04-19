package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:39:00
 * 循环依赖测试beanA
 */
public class CircleBeanB {

	public CircleBeanB() {
		System.out.println("CircleBeanB 构造，此时 circleBeanA 是否为空？" + (circleBeanA == null));
	}

	private CircleBeanA circleBeanA;

	public CircleBeanA getCircleBeanA() {
		return circleBeanA;
	}

	public void setCircleBeanA(CircleBeanA circleBeanA) {
		this.circleBeanA = circleBeanA;
	}
}
