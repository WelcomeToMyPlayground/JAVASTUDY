package sec06;

import java.util.Scanner;

public class Student {
	
	private String name="ȫ�浿"; 		 //�л� �̸�
	private String code="A123"; 		 //�й�
	private int middelScore;			 //�߰���� ����
	private int finalScore;		         //�⸻��� ����
	private double avg;		 			 //�������
	
	// �ν��Ͻ� �ʵ� final ���� => final �ʵ�� �ʱⰪ�� ����Ǹ� �� �ʵ�� �� �̻� ������ �Ұ����ϴ�
	final String id="admin";      // ������ ���̵�
	final int password = 1234;    // ������ ��й�ȣ
	

	Scanner s = new Scanner(System.in);
	
	public boolean checkLogin() {
		
		System.out.println("���̵� �Է��ϼ���");
		String id = s.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		int password = s.nextInt();
		
		if(this.id.equals(id) && this.password == password) {  // 
			return true;
		} else {
			return false;
		}
	}
	
	public void inputExam() {
		
		System.out.println("�߰���� ������ �Է��ϼ���");
		setMiddelScore(s.nextInt());
		System.out.println("�⸻��� ������ �Է��ϼ���");
		setFinalScore(s.nextInt());
		
		double avg =(double)(getMiddelScore() +getFinalScore())/2 ;
		setAvg(avg);
		System.out.println(getName() + "���� ��� ������ : " + getAvg());
		
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
