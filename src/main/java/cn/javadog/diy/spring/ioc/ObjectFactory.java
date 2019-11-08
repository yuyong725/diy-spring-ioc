package cn.javadog.diy.spring.ioc;

import cn.javadog.diy.spring.ioc.exception.BeansException;

/**
 * @author Sprite
 * @date 2019年11月08日 12:02:00
 */
@FunctionalInterface
public interface ObjectFactory<T> {

	T getObject() throws BeansException;


}
