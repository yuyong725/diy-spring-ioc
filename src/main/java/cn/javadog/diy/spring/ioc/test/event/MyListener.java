package cn.javadog.diy.spring.ioc.test.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author 余勇
 * @date 2020年04月17日 20:34:00
 */
public class MyListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof MyEvent) {
			((MyEvent) event).print();
		}
	}
}
