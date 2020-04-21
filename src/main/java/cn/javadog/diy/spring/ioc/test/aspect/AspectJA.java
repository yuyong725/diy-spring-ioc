package cn.javadog.diy.spring.ioc.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 余勇
 * @date 2020年04月19日 14:31:00
 */
@Aspect
public class AspectJA {

	@Pointcut("execution(* *.testAop(..))")
	public void test(){}

	@Before("test()")
	public void beforeTest() {
		System.out.println("AOP test before");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("AOP test after");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.out.println("AOP test around before");

		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {

		}

		System.out.println("AOP test around after");
		return o;
	}


	public void other() {
		System.out.println("AOP test other");
	}
}
