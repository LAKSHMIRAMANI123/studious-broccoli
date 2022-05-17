package ai.jobiak.usersource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.BDigital;
import ai.jobiak.source.A;

public class TestAB {

	public static void main(String[] args) {
		
		
		//B b=new B();
		//b.dopublishing();//throws NullPointer Exception
        //before spring
		//after spring
		
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beanfactory.xml"));  
		
		/*
		B b =(B)factory.getBean("b");
		b.dopublishing();
		if(factory.containsBean("aObj")) {
			A a=(A)factory.getBean("aObj");
			a.print();
		}
		*/
		//with interfaces as begining
		BDigital bDigital =(BDigital)factory.getBean("bDigital");
		bDigital.publish();
		
	}

}
