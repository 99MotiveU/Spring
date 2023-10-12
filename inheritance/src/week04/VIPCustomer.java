package week04;

public class VIPCustomer extends Customer{
	//VIP 고객에 속성
	double saleRatio; // 가격할인
	private int agentID; // VIP고객 상담원
	
	public VIPCustomer() {
		super(); // 컴파일러가 자동으로 추가해줌
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05; // 5%적립
		this.saleRatio = 0.1; // 10% 할인
		this.agentID = agentID;
		System.out.println("VIPCustomer() 생성자 호출 - 하위 클래스");
	}
		
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05; // 5%적립
		this.saleRatio = 0.1; // 10% 할인
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String) 생성자 호출 - 하위 클래스");
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio); //VIP고객
		return price;
		//return super.calcPrice(price);
	}

	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() +", 상담원 아이디는 "
				+ agentID + "입니다.";
	}
}
