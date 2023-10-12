package kr.ac.inje.comsi.aop;

import org.aspectj.lang.JoinPoint;

public class LogBindingAdvice {
	//before
	public void before(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[]args = jp.getArgs(); // 매개변수
		System.out.println("[사전처리] " + method + "() 와 매개변수 정보 : " + args[0].toString());
		
	
	}
}
