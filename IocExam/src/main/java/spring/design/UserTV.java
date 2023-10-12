package spring.design;

public class UserTV {

	public static void main(String[] args) {
		//SamsungTV 사용
//		SamsungTV stv = new SamsungTV();
//		stv.powerOn();
//		stv.powerOff();
//		stv.volumeUp();
//		stv.volumeDown();
		BeanFactory factory = new BeanFactory();
		TV tv = factory.getBean("samusng");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
