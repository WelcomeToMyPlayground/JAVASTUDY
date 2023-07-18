package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);  
		
		Parent parentB = new Parent();
		method1(parentB); 
	}

	public static void method1(Parent parent) {
		
		// Child 타입으로 변환이 가능한지 확인
		// 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋음
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 강제 변환 성공");
		} else {
			System.out.println("method1 - Child로 강제 변환 실패");
		}

	}
}
