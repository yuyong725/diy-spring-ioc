package cn.javadog.diy.spring.ioc.resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 统一资源
 * @author Sprite
 * @date 2019年11月06日 19:29:00
 */
public interface Resource {

	/**
	 * 返回资源的输入流
	 */
	InputStream getInputStream() throws IOException;

	/**
	 * 资源是否存在
	 */
	boolean exists();

}
