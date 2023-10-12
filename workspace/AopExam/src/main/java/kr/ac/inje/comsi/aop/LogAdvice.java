package kr.ac.inje.comsi.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	public void printLogBefore() {
		System.out.println("[공통로그-Before] 핵심 로직 수행 전에 수행");
	}
	
	public void printLogAfter() {
		System.out.println("[공통로그-Before] 핵심 로직 수행 전에 수행");
	}
	
	public void printAfterThrowing() {
		System.out.println("[공통로그-AfterThrowing] 핵심 로직에서 예외가 발생하여 수행");
	}
	
	public void printLogAfterReturning() {
		System.out.println("[공통로그-AfterReturning] 핵심 로직이 정상 종료 후 수행");
	}
	
	public Object printLogAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[공통로그 - Around] 핵심로직 수행 전에 Around 실행됨");
		Object rtnObj = pjp.proceed(); //핵심로직을 수행시키는 작업 수행
		System.out.println("[공통로그 - Around] 핵심로직 수행 후에 Around 실행됨");
		return rtnObj;
	}
}
