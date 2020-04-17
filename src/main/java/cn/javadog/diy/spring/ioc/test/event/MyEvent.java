package cn.javadog.diy.spring.ioc.test.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 余勇
 * @date 2020年04月17日 20:32:00
 */
public class MyEvent extends ApplicationEvent {

	String msg;

	public MyEvent(Object source) {
		super(source);
	}

	public MyEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public void print() {
		System.out.println("接收事件: " + this.msg);
	}
}
