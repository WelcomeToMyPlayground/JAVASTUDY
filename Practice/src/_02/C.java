package _02;
// 자식 클래스
public class C extends P{
	
	// !! 부모를 명시적으로 호출하고 있는지 꼭 확인!!
	
	// 부모의 생성자를 명시적으로 호출하지 않을 때는
	// 부모가 갖고 있는 디폴트(인자 없는) 생성자를 묵시적으로 호출
	
	// 부모가 갖고있는 생성자 먼저 출력하고 본인 출력
	
	C () { 
		System.out.println("C");
	}
	// 출력: A -> C
	
	// 이것도 동일
	// D를 출력하기 전에 부모 먼저 호출
	C (int a) {
		System.out.println("D");
	}
	// 출력: A -> D
	
	// super을 사용해서 부모(P)를 명시적으로 호출하고있음
	// int a 인자 하나를 넘겼기때문에 
	// 부모가 갖고있는 인자 있는 생성자 P (int a)를 호출하고
	// 다시 돌아와서 본인 출력
	C (int a, int b) {
		super(a);
		System.out.println("E");
	}
	// 출력: B -> E
}
