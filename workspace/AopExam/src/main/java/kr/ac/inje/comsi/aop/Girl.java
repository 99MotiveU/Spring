package kr.ac.inje.comsi.aop;

public class Girl {
	public void runSomething() {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
		try {
			System.out.println("요리해서 식사를 한다."); //여자의 삶
			System.out.println("TV를 본다.");
		} catch(Exception e) {
			if(e.getMessage().equals("집에 불남")) {
				System.out.println("119에 신고를 한다.");
			}
		} finally {
			System.out.println("소등하고 잠을 잔다.");
		}
		System.out.println("자물쇠로 잠그고 집을 나선다");
	}
}
