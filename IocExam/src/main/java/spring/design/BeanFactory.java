package spring.design;

public class BeanFactory {
	public TV getBeam(String beanName) {
		TV tv = null;
		
		if (beanName.equals("samsung")) {
			tv = new SamsungTV();
		}else if (beanName.equals("lg")) {
			tv = new LgTV();
		}
		return tv;
	}
}
