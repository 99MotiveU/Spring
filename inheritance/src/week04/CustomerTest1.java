package week04;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer kim = new Customer(10010, "김유신");
		kim.bonusPoint = 1000;
		System.out.println(kim.showCustomerInfo());
		
		VIPCustomer lee = new VIPCustomer(10020,"이순신",12345);
		lee.bonusPoint = 10000;
		System.out.println(lee.showVIPInfo());
		
		int price = 10000;
		System.out.println(kim.getCustomerName()
				+ "님이 지불해야 하는 금액은 " + kim.calcPrice(price)
				+"원 입니다.");
		System.out.println(lee.getCustomerName()
				+ "님이 지불해야 하는 금액은 " + lee.calcPrice(price)
				+"원 입니다.");
		
		System.out.println("//////////////////////////////////////////////////////");
		Customer park = new VIPCustomer(10030,"박경태", 123456);
		System.out.println(park.getCustomerName()
				+ "님이 지불해야 하는 금액은 " + park.calcPrice(price)
				+"원 입니다.");
	}
}
