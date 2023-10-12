package di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV {
	
	@Autowired
	private Speaker speaker; // Speaker 객체 참조 변수
	private int price; 	// Speaker 가격, 1_000_000
		
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성");
	}	
	
	public void powerOn() {		
		System.out.println("SamsungTV - 전원을 켠다(Speaker 가격=" + price + ").");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV - 전원을 끈다.");
	}
	public void volumeUp() {
		// BritzSpeaker 사용
//		speaker = new BritzSpeaker();
		speaker.volumeUp();		
	}
	public void volumeDown() {
		// BritzSpeaker 사용
//		speaker = new BritzSpeaker();
		speaker.volumeDown();		
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("SamsungTV -- setSpeaker() 호출");
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("SamsungTV -- setPrice() 호출");
	}	
}

