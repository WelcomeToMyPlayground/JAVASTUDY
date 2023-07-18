package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar ();
		
		// 외부 호출
		myCar.keyTurnOn();    // 키를 돌립니다
		myCar.run();		  // 달립니다 (반복문)
		
		int speed = myCar.getSpeed();   // speed값 
		System.out.println("현재 속도: " + speed + "km/h");
		
	}

}
