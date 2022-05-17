package com.jobiak.auto;

	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jobiak.auto.Line;
	public class TestLine {

	public static void main(String[] args) {
			
	ApplicationContext context=new ClassPathXmlApplicationContext("garden-beans.xml");
	Line line=(Line)context.getBean("line");
	
		
	}
	
}
