package cn.javadog.diy.spring.ioc.resourceloader;

import cn.javadog.diy.spring.ioc.resource.ClassPathResource;
import cn.javadog.diy.spring.ioc.resource.Resource;

/**
 * classpath类型的资源的加载
 * @author Sprite
 * @date 2019年11月06日 20:25:00
 */
public class ClassPathResourceLoader implements ResourceLoader {

	@Override
	public Resource getResource(String location) {
		if (!location.startsWith(CLASSPATH_URL_PREFIX)){
			throw new IllegalArgumentException("资源定位必须以`classpath:`开头，参数 [" + location +  "] 不符合要求");
		}
		return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
	}
}
