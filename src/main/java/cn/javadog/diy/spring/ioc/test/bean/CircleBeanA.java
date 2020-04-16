package cn.javadog.diy.spring.ioc.test.bean;

/**
 * @author 余勇
 * @date 2020年04月15日 17:39:00
 * 循环依赖测试beanA
 */
public class CircleBeanA {

	private CircleBeanB circleBeanB;

	public CircleBeanB getCircleBeanB() {
		return circleBeanB;
	}

	public void setCircleBeanB(CircleBeanB circleBeanB) {
		this.circleBeanB = circleBeanB;
	}
}
