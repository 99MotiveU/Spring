package week11;

public class Phone {
	protected String model;
	protected String color;
	public Phone() {
		System.out.println("나는 부모");
	}
	
	public void bell() {
		System.out.println("벨이 울림");
	}
	public void sendVoice(String message) {	
		System.out.println("자기:" + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}
	public void hangUp() {
		System.out.println("전화 종료");
	}
}
