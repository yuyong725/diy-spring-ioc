package cn.javadog.diy.spring.ioc.test.beanfactorypostprocessor;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

/**
 * @author 余勇
 * @date 2020年04月17日 13:53:00
 */
public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private Set<String> obscenities;

	public ObscenityRemovingBeanFactoryPostProcessor() {
		this.obscenities = new HashSet<>();
	}

	public void setObscenities(Set<String> obscenities) {
		this.obscenities.clear();
		for (String obscenity : obscenities) {
			this.obscenities.add(obscenity.toUpperCase());
		}
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

		for (String definitionName : beanDefinitionNames) {
			BeanDefinition bd = beanFactory.getBeanDefinition(definitionName);
			StringValueResolver valueResolver = strVal -> {
				if (isObscenities(strVal)){
					return "*****";
				}
				return strVal;
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
	}

	public boolean isObscenities(String value) {
		String potentialObscenities = value.toUpperCase();
		return this.obscenities.contains(potentialObscenities);
	}
}
