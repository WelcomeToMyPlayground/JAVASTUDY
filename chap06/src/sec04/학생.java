package sec04;

// �л� Ŭ����
public class �л� {
	
	// ������� ����
	String gender;   // ����
	String code;	 // �а��ڵ�
	int score;		 // ���輺��
	
	// �Ű����� 3���� ������, �⺻ �����ڴ� �������� ����
	// ��Ŭ�� -> Source -> Using fields���� ������ �����
	public �л�(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	//start �޼ҵ�� ���ϰ� x
	// �����ڿ��� �Ѿ�� ���� ����ϰ� ���ο��� end��� �޼ҵ带 ȣ��
	void start () {		
		System.out.println("���� : " + gender);
		System.out.println("�а��ڵ� : " + code);
		System.out.println("���輺�� : " + score);
		String grade =  end(score); // end�� return ���� String�̶� String Ÿ������ �޾Ƴ�
		System.out.println("���� : " + grade);
	}
	
	// end �޼ҵ�� ���� ����
	// ���輺������ ������ ����. 90�̻� A, 80�̻� B, 70�̻� C, ������ F
	
	String end(int score) {     // �����̴ϱ� String , ���ϰ� O , ����Ÿ���� String
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
		return grade;          // return�� if�� �ۿ� ����
	}

}
