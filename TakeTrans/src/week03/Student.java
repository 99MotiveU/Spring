package week03;

public class Student {
	String studentName;
	int grade;
	int money;
	
	Student(String studentName, int grade, int money){
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName +"남의 남은 돈은 " +
					money + "원 입니다.");
	}
	
}
