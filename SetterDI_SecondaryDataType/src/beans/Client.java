package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main (String args[]) {
		
		String files[] = new String[] {"resources/car.xml" , "resources/engine.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);
		Car c = (Car)ap.getBean("c");
		c.printCarData();
	}
}
