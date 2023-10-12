package spring.general;

public class UserTV {

	public static void main(String[] args) {
		//SamsungTV 사용
//		SamsungTV stv = new SamsungTV();
//		stv.powerOn();
//		stv.powerOff();
//		stv.volumeUp();
//		stv.volumeDown();
		
		LgTV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
