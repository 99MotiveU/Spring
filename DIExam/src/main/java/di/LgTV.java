package di;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV {// id ---> lgTV
	public void powerOn() {
		System.out.println("LgTV - 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV - 전원을 끕니다.");
	}
	
	public void volumeUp() {
		System.out.println("LgTV - 볼륨을 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("LgTV - 볼륨을 내린다.");
	}
}
