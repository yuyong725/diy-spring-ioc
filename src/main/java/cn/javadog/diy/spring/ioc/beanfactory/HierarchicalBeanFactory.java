package cn.javadog.diy.spring.ioc.beanfactory;

/**
 * @author 余勇
 * @date 2020年04月02日 15:56:00
 *
 * 容器继承关系的获取
 */
public interface HierarchicalBeanFactory extends BeanFactory{

	BeanFactory getParentBeanFactory();

}
