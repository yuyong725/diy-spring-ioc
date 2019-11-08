package cn.javadog.diy.spring.ioc.beandefinition;

/**
 * 留个口子做模版，暂时啥也不做
 * 关于xml中一些高级的属性，应放在此类中
 * @author Sprite
 * @date 2019年11月07日 12:11:00
 */
public abstract class AbstractBeanDefinition implements BeanDefinition {

	/**
	 * 可能是 class 也可能是 className
	 * NOTE 目前暂时只使用className
	 */
	private volatile Object beanClass;

	public AbstractBeanDefinition() { }

	public AbstractBeanDefinition(BeanDefinition original) {
		setBeanClassName(original.getBeanClassName());
	}

	@Override
	public void setBeanClassName(String beanClassName){
		this.beanClass = beanClassName;
	}

	@Override
	public String getBeanClassName(){
		Object beanClassObject = this.beanClass;
		if (beanClassObject instanceof Class) {
			return ((Class<?>) beanClassObject).getName();
		}
		else {
			return (String) beanClassObject;
		}
	}

	public Class getBeanClass() {
		Object beanClassObject = this.beanClass;
		if (beanClassObject instanceof Class) {
			return (Class<?>) beanClassObject;
		}
		else {
			try {
				return Class.forName(beanClassObject.toString());
			} catch (ClassNotFoundException e) {
				// FIXME
				return null;
			}
		}
	}


}
