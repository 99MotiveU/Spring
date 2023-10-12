package kr.ac.inje.comsi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//@Aspect
public class MyAspect {
//	/@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집으로 들어간다.");
	}
	
//	@After("execution(* runSomething())")
	public void after(JoinPoint joinPoint) {
		System.out.println("TV를 본다.");
	}
}
