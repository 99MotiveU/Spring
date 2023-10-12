package week03;

public class TakeTrans {

	public static void main(String[] args) {
		Student lee = new Student("이순신", 5, 10000);
		Student hong = new Student("홍길동", 6, 15000);
		//버스
		Bus bus8 = new Bus(8);
		lee.takeBus(bus8);
		lee.showInfo();
		bus8.showInfo();
		// 지하철
		Subway subway2 = new Subway("2호선");
		hong.takeSubway(subway2);
		hong.showInfo();
		subway2.showInfo();
	}

}
