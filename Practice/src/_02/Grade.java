package _02;

public class Grade {
	
	// 필드 3개
	private int math;
	private int science;
	private int english;
	
	// 생성자 1개 (매개변수 3개짜리)
	public Grade(int math, int science, int english) {

		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	// 메소드 4개!
	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public double average() {
		int sum = getMath()+getScience()+getEnglish();
		double avg = (double) sum/3;
		return avg;
		
	}
	
}
