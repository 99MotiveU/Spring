package spring.polymorphism;

public class UserTV {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUP();
		tv.volumeDown();
		tv.powerOff();
	}

}
