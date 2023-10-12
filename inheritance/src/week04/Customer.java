package week04;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		this.customerGrade = "SIVER"; // 등급
		this.bonusRatio = 0.01; // 적립 비율
		System.out.println("VIPCustomer() 생성자 호출 - 상위 클래스");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SIVER"; // 등급
		this.bonusRatio = 0.01; // 적립 비율
		System.out.println("Customer(int, String) 생성자 호출 - 상위 클래스");
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님 등급은 " + customerGrade 
				+ "이며, 보너스 포인트는 " + bonusPoint +"입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
