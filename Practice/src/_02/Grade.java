package _02;

public class Grade {
	
	// �ʵ� 3��
	private int math;
	private int science;
	private int english;
	
	// ������ 1�� (�Ű����� 3��¥��)
	public Grade(int math, int science, int english) {

		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	// �޼ҵ� 4��!
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
