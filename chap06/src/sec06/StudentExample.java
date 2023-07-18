package sec06;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			boolean check = student.checkLogin();   // 로그인 점검 메소드 작성
			
			if(check) {  //로그인 되었다면 로그아웃(종료), 성적 입력 처리
				System.out.println("작업을 선택해주세요");
				System.out.println("1번은 로그아웃, 2번은 성적 입력");
				int choice = s.nextInt();
				
				if(choice==1) {
					run = false;
				} else if(choice==2) {
					student.inputExam();  //성적 입력 메소드 작성
				}
			} else {
				System.out.println("로그인이 실패하였습니다.");
			}
		}
		
//		Student s = new Student("홍길동",30);
//		
//		s.address ="광주광역시";    // 에러 - 멤버 변수를 private로 선언했기 때문에 접근 불가능
//		s.setAddress("광주광역시");    
//		System.out.println(s.getAddress()); // 값 가져오기 - getter
	}

}
