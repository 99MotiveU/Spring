package kr.ac.inje.comsi.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DailyMain {

	public static void main(String[] args) {
		// Boy's routine
		AbstractApplicationContext container = new GenericXmlApplicationContext("aop-context.xml");
		
		Person romeo = container.getBean("romeo",Person.class);
		romeo.runSomething();
		container.close();
//		Person romeo = new Boy();
//		System.out.println("Romeo's Daily Routine!!!");
//		romeo.runSomething();
//		
//		System.out.println(" ");
//		// Girl's routine
//		Girl juliet = new Girl();
//		System.out.println("juliet's Daily routine!!!");
//		juliet.runSomething();
	}

}
