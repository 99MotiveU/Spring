package di;
import org.springframework.context.annotaion.AnnotationConfigApplicationContext;
public class UserTV {

	public static void main(String[] args) {
		//SamsungTV 사용
//		SamsungTV stv = new SamsungTV();
//		stv.powerOn();
//		stv.powerOff();
//		stv.volumeUp();
//		stv.volumeDown();
		AnnotationConfigApplictionContext container
			= new AnnotationConfigApplicationContext(AppContext.class);
		TV tv = container.getBean("stv", TV.class);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
