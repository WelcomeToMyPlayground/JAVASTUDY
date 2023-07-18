package sec03;

public class Car {

		String company;
		String model;
		String color;
		int maxspeed;
		int speed;
		
		public Car() {
			//기본 생성자
		}
		
		public Car(String model, int speed) {  
			// 필드와 매개변수 이름이 완전히 동일할 경우
			// this.필드로 표현
			
			this.model = model;
			this.speed = speed;    
		}
		
		public Car(String model, String color, int maxspeed) {  // 
			
			this.model = model;
			this.color = color;
			this.maxspeed = maxspeed;
		}
}
