package chap09.sec02;

public class StudentExample {

	public static void main(String[] args) {

		// StudentB 객체 생성하세요
		StudentA sta = new StudentA();
		StudentA.StudentB stb = sta.new StudentB();
		// StudentA.StudentB stb = new StudentA().new StudentB(); // 이렇게 한 줄로도 가능

		stb.name = "김철수";
		stb.age = 22;
		stb.sleep();

		sta.person.wake();
//		sta.person.work();  // 이거 왜 안되나요 => 오버라이드 안된 메소드를 직접 호출 불가능
		sta.method1();

		// method2는 매개변수로 Person 클래스 타입을 넘겨줘야 함
		// 매개변수는 마지막에 세미콜론; 사용 안 함
		sta.method2(new Person() {
			void study() {
				System.out.println("공부합니다");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
				// 오버라이드 안된 메소드는 바로 호출이 불가능하기 때문에
				// 이중으로 메소드를 호출함
			}

		}
		);
	}

}
