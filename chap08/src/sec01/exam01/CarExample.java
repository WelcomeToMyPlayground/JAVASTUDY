package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car =new Truck();
		
		car.speedUp(30);
		car.speedDown(300);
		
		// 만약 Car을 구현한 SportCar 클래스가 있다면
		// car = new SportCar(); 를 이용하여
		// car 인터페이스 하나로 두 객체에 동시 접근 가능함
		
		car = new SportCar();
		car.speedUp(50);
		car.speedUp(20);
	}

}
