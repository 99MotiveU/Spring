package di;


public class BritzSpeaker implements Speaker {
	public BritzSpeaker() {
		System.out.println("BritzSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("BritzSpeaker의 볼륨을 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("BritzSpeaker의 볼륨을 내린다.");
	}
}

