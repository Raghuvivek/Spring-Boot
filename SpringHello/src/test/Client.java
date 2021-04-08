package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	
	public static void main (String args[]) {
		Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		ap.getBean("t");
		
		Object o = factory.getBean("t");
		Object o1 = factory.getBean("t");
		Object o2 = factory.getBean("t");
		Test t =(Test) o;
		t.hello();
	}

}
