package sec01;

public class Student extends Human {
	
	int studentCode;     // 학번
	String studentDept;  // 학과

	Student(int weight, int height, int studentCode) {
		super(weight, height);
		this.studentCode = studentCode;
	}
	
//	Student(int studentCode, String gender, int height) {
//		this.studentCode = studentCode;
//		this.gender = gender; // Human으로부터 상속받은 필드
//		this.height = height; // Human으로부터 상속받은 필드
//	}
	
	//메소드 
	void study(String place) {   // 리턴값 없이 출력만 하고 끝남
		System.out.println(place + "에서 공부합니다.");
	}
	
	void dressOn() {
		System.out.println("교복을 입습니다.");
	}
	
	void dressOff() {
		System.out.println("교복을 벗어요.");
	}
	
	//Human의 eat 메소드 오버라이딩
	@Override
	String eat(String food) {
		String result = food + "를 매일 먹어요";
		return result;
	}	
}
