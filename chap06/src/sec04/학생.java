package sec04;

// 학생 클래스
public class 학생 {
	
	// 멤버변수 선언
	String gender;   // 성별
	String code;	 // 학과코드
	int score;		 // 시험성적
	
	// 매개변수 3개인 생성자, 기본 생성자는 생성되지 않음
	// 우클릭 -> Source -> Using fields에서 생성자 만들기
	public 학생(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	//start 메소드는 리턴값 x
	// 생성자에서 넘어온 값을 출력하고 내부에서 end라는 메소드를 호출
	void start () {		
		System.out.println("성별 : " + gender);
		System.out.println("학과코드 : " + code);
		System.out.println("시험성적 : " + score);
		String grade =  end(score); // end는 return 값이 String이라서 String 타입으로 받아냄
		System.out.println("학점 : " + grade);
	}
	
	// end 메소드는 학점 리턴
	// 시험성적으로 학점을 구함. 90이상 A, 80이상 B, 70이상 C, 나머지 F
	
	String end(int score) {     // 학점이니까 String , 리턴값 O , 리턴타입이 String
		String grade;
		
		if (score >= 90) {
			grade = "A";
		} else if(score >=80) {
			grade = "B";
		}  else if(score >=70) {
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;          // return은 if문 밖에 선언
	}

}
