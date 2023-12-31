package sec02.exam05;

public class PhoneExample {
	
	public static void main(String[] args) {
		
		//SmartPhone sp = new SmartPhone();  // 기본 객체 생성은 본인 것을 갖고옴
		//System.out.println(sp.cost); // SmartPhone 본인 호출
		
		Phone p = new SmartPhone();
		// 자식 개체를 부모 객체에 타입 변환 시킴 (자동변환)
		System.out.println(p.cost);
		p.powerOn();
		p.ring();  // 오버라이드 메소드 호출
		// p.videoOn();  // 자식 클래스 메소드 호출 안됨
		// p.PhoneCase="하드케이스";  // 자식 클래스 필드 사용 안됨
		
		SmartPhone sp = (SmartPhone)p;
		// 부모 객체를 자식 객체에 강제 타입 변환 시킴
		sp.Phonecase="소프트케이스"; // 자식 객체 필드나 메소드 사용 가능
		sp.powerOn();				 // 부모 객체 메소드 사용 가능, 상속 받았기 때문
		System.out.println(sp.cost); // 200000 출력, 같은 이름의 필드는 자식 객체 출력
		
		//Phone p2 = new Phone();          // 자식 타입이 부모 타입으로 변환하지 않은 상태에서 
		//SmartPhone sp2 = (SmartPhone)p2; // 부모 타입을 자식 타입으로 강제 변환은 되지 않음
	
		//출력결과
		//100000
		//전원이 켜집니다
		//스마트폰이 울립니다
		//전원이 켜집니다
		//200000		
	}
}
