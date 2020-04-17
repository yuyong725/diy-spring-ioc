package cn.javadog.diy.spring.ioc.test.bean;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

/**
 * @author 余勇
 * @date 2020年04月17日 21:09:00
 */
public class AdvancedBeanD implements SmartLifecycle {

	private volatile boolean running;

	@Override
	public void start() {
		this.running = true;
		System.out.println("AdvancedBeanD start");
	}

	@Override
	public void stop() {
		this.running = false;
		System.out.println("AdvancedBeanD stop");
	}

	@Override
	public boolean isRunning() {
		return this.running;
	}
}
