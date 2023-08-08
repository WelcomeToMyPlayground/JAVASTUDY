class Parent{}
class Child extends Parent{}

public class InstanceofTest {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		
		// instanceof는 객체 타입을 확인하는 연산자
		// 형변환 가능 여부를 확인하며 true/false로 결과를 반환함
		// 주로 상속 관계에서 부모 객체인지 자식 객체인지 확인하는데 사용된다
		// instanceof의 기본 사용 방법은 "객체 + instanceof + 클래스"를 선언함으로써 사용한다
		
		// 쉽게 말해서 instanceof는 해당 클래스가 자기집이 맞는지 확인해 주는 것이라고 생각하면 된다.
		
		// 1. 부모가 본인 집을 찾았으니 true
		System.out.println(parent instanceof Parent); 
		// 2. 자식이 상속받은 부모 집을 찾았으니 true (상속 받았으니 자기 집이라해도 무방하다?)
		System.out.println(child instanceof Parent); 
		// 3. 부모가 자식 집을 찾았으니 false
		System.out.println(parent instanceof Child); 
		// 4. 자식이 본인 집을 찾았으니 true
		System.out.println(child instanceof Child);    // true
	}

}
