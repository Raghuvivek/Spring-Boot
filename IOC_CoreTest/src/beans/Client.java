package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main (String args[]) {
		Resource resource = new ClassPathResource("resources/spring.xml");
		
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		beanfactory.getBean("t"); // If scope is singleton and its beanfactory then we are creating object only while calling getbean 
		beanfactory.getBean("t");
		beanfactory.getBean("t");
	}
}
