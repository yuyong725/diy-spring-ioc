package cn.javadog.diy.spring.ioc.resourceloader;

import cn.javadog.diy.spring.ioc.resource.Resource;
import cn.javadog.diy.spring.ioc.util.ResourceUtils;

/**
 * 统一资源的加载的抽象
 * @author Sprite
 * @date 2019年11月06日 20:07:00
 */
public interface ResourceLoader {

	String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;

	/**
	 * 获取资源的定位
	 */
	Resource getResource(String location);
}
