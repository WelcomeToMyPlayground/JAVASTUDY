package sec06;

import java.util.Scanner;

public class Student {
	
	private String name="홍길동"; 		 //학생 이름
	private String code="A123"; 		 //학번
	private int middelScore;			 //중간고사 점수
	private int finalScore;		         //기말고사 점수
	private double avg;		 			 //평균점수
	
	// 인스턴스 필드 final 선언 => final 필드는 초기값이 저장되면 그 필드는 더 이상 수정이 불가능하다
	final String id="admin";      // 관리자 아이디
	final int password = 1234;    // 관리자 비밀번호
	

	Scanner s = new Scanner(System.in);
	
	public boolean checkLogin() {
		
		System.out.println("아이디를 입력하세요");
		String id = s.next();
		System.out.println("비밀번호를 입력하세요");
		int password = s.nextInt();
		
		if(this.id.equals(id) && this.password == password) {  // 
			return true;
		} else {
			return false;
		}
	}
	
	public void inputExam() {
		
		System.out.println("중간고사 성적을 입력하세요");
		setMiddelScore(s.nextInt());
		System.out.println("기말고사 성적을 입력하세요");
		setFinalScore(s.nextInt());
		
		double avg =(double)(getMiddelScore() +getFinalScore())/2 ;
		setAvg(avg);
		System.out.println(getName() + "님의 평균 점수는 : " + getAvg());
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getMiddelScore() {
		return middelScore;
	}
	public void setMiddelScore(int middelScore) {
		this.middelScore = middelScore;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getId() {
		return id;
	}
	public int getPassword() {
		return password;
	}
}
