package sec02;
// Tire 인터페이스 구현
public class KumhoTire implements Tire {
	
	// 인터페이스에 선언된 roll() 추상 메소드 재정의(오버라이딩)
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
		
	}	
}
