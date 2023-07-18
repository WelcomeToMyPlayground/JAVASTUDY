package sec04;

public class CarExample {
	//main 메소드는 프로그램의 시작점 역할
	//main 메소드가 없는 프로그램은 별도로 동작할 수 없음
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.powerOn();
		
		int result1 = car.speedUp(30);
		System.out.println("현재 속도는: " + result1 + "입니다.");
		
		int result2 = car.speedUp(20);
		System.out.println("현재 속도는: " + result2 + "입니다.");
		
		int result3 = car.speedDown(70);
		System.out.println("현재 속도는: " + result3 + "입니다.");
		
		int result4 = car.breakZero();
		System.out.println("현재 속도는: " + result4 + "입니다.");
		
		car.powerOff();
		

	}

}
