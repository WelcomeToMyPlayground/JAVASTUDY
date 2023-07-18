package sec03;

public class Car1 {

		String company;
		String model;
		String color;
		int maxspeed;
		int speed;
		
		public Car1() {
			//기본 생성자
		}
		
		public Car1(String m, int s) {    
			model = m;
			speed = s;    // 위에 입력한 값이 없어서 여기서 초기화 해주는 거임
		}
}
