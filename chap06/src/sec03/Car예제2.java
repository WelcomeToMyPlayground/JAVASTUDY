package sec03;

public class Car예제2 {

	public static void main(String[] args) {
		
		Car car = new Car("테슬라3", "빨강", 350); {
			
			System.out.println("모델명: " + car.model);
			System.out.println("색상: " + car.color);
			System.out.println("최고 속도: " + car.maxspeed);
		}
	}
	

}
