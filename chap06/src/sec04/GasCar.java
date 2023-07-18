package sec04;

public class GasCar {
	// 필드
	int gas;

	void setGas(int gas) {
		this.gas = gas;
		System.out.println("가스가 5만큼 충전되었습니다.");
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;   // false를 리턴
		}
		System.out.println("가스가 있습니다.");
		return true;  //true를 리턴
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("가스잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("가스잔량 : " + gas);
				return;  // 메소드 실행 종료
			}
		}
	}
}
