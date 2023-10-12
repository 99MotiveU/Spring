package spring.polymorphism;

public class SamsungTV implements TV {

	public void powerOn() {
		System.out.println("SamsungTV - 전원을 켠다.");

	}

	public void powerOff() {
		System.out.println("SamsungTV - 전원을 끈다.");

	}

	public void volumeUP() {
		System.out.println("SamsungTV - 볼륨을 높인다.");

	}

	public void volumeDown() {
		System.out.println("SamsungTV - 볼륨을 낮춘다.");
	}

}
