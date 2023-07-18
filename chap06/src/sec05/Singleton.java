package sec05;

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
	} // 생성자

	static Singleton getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();    => 싱글톤 사용 방식이 아님
//		Singleton obj2 = new Singleton();    => 컴파일 에러. 싱글톤은 한 번만 사용 가능

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 객체");   // 출력 - 동일한 곳을 참조하고있음
		} else
			System.out.println("다른 객체");
	}
}
