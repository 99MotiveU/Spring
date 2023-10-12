package kr.ac.inje.comsi.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DailyMain {

	public static void main(String[] args) {
		//
		AbstractApplicationContext container = new GenericXmlApplicationContext("aop-context.xml");
		
		Person romeo = container.getBean("romeo", Person.class);
		try{
			romeo.runSomething(100);		
		}catch(Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		container.close();
		
		
//		System.out.println("Romeo's Routine!!!!");
//		romeo.runSomething();
//		//
//		System.out.println();
//		//
//		Girl juliet = new Girl();
//		System.out.println("juliet's Routine!!!");
//		juliet.runSomething();
	}

}
