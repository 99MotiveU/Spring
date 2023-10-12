package kr.ac.inje.comsi.aop;

public class Boy implements Person {
	@Override
	public void runSomething()  {
		System.out.println("컴퓨터로 게임을 한다.");
	}
	
	public void runSomething(int num) throws Exception{
		System.out.println("컴퓨터로 게임을 한다(예외발생 전-정상)");
		 if(num ==0)throw new Exception();
		System.out.println("예외가 발생하지 않고 정상적으로 종료.");
	}
}
