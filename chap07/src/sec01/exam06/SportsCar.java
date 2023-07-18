package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop(){   //final 메소드는 오버라이딩 불가능
//		System.out.println("스포츠카를 멈춤");
//		speed =0;
//	}
	
	public void stop(int x) {
		// 리턴값이나 매개변수!를 변경하면 메소드 오버라이드 아님! 아예 다른 것
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
}
