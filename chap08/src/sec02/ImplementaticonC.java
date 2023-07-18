package sec02;

public class ImplementaticonC implements interfaceC {

	@Override
	public void methodA() {
		System.out.println("메소드A 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("메소드B 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("메소드C 실행");
		
	}
	
	public static void main(String[] args) {
		ImplementaticonC imple = new ImplementaticonC();
		// 인터페이스C 객체인 ic는 A와 B의 모든 메소드 사용 가능함
		interfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
	
}
