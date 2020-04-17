package cn.javadog.diy.spring.ioc.test.bean;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author 余勇
 * @date 2020年04月16日 19:41:00
 */
public class TestMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我是替身");
		return null;
	}
}
