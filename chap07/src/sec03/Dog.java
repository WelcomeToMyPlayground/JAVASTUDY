package sec03;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("강아지는 멍멍");
		
	}
	
}
