package cn.javadog.diy.spring.ioc.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * class path 类型资源的实现。使用给定的 ClassLoader 或者给定的 Class 来加载资源。
 * @author Sprite
 * @date 2019年11月06日 19:50:00
 */
public class ClassPathResource implements Resource {

	/**
	 * 资源路径
	 */
	private final String path;

	public ClassPathResource(String path) {
		this.path = path;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		InputStream is = ClassLoader.getSystemResourceAsStream(this.path);
		if (is == null) {
			throw new FileNotFoundException("路径 [" + this.path + "] 找不到文件");
		}
		return is;
	}

	@Override
	public boolean exists() {
		return ClassLoader.getSystemResourceAsStream(this.path) != null;
	}
}
