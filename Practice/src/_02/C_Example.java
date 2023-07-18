package _02;
// 실행
public class C_Example {

	public static void main(String[] args) {
		
		// 1번
		P p1 = new C();  
		//p1이라는 인스턴스는 부모(P) 형태로 날 낳은것
		//상속 관계에서는 부모(P)부터 출력하고 돌아와서 본인 출력
		
		// 2번
		P p2 = new C(1);
		
		// 3번
		P p3 = new C(1,2);
		
		
		// 출력결과
		//A
		//C
		//A
		//D
		//B
		//E

	}

}
