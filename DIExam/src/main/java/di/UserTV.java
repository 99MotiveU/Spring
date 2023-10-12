package di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserTV {

	public static void main(String[] args) {
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("appContext.xml");
		SamsungTV stv = container.getBean("stv", SamsungTV.class);
		//LgTV lgtv = container.getBean("tv", LgTV.class);
		stv.powerOn();
		stv.volumeUp();
		stv.volumeDown();
		stv.powerOff();
		container.close(); 
	}

}

