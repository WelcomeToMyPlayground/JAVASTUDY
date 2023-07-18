package sec04;

		//시동걸기, 시동끄기 return x
		// (기본 속도 100) + 속도 10씩 증가
		// 감소 - 10 
		// 멈춤 
public class Car {
	
	
	private int speed = 100;    // 기본속도
	
	
	void powerOn() {
		System.out.println("시동이 걸렸습니다.");
	}
	
	void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	
	int speedUp (int x) {
		
		speed += x;
		return speed;
	}
	
	int speedDown (int y) {
		
		speed -= y;
		return speed;
	}
	
	int breakZero() {
		speed = 0;
		return speed;
	}

}