package sec01;

public class Notebook extends Computer {
	// ��� �ʵ�
	String model;  // ��Ʈ�� �𵨸�
	
	Notebook(String company, int price, String date) {
		this.company = company;  // ��� �ʵ�
	    this.price = price;   // ��� �ʵ�
	    this.date = date;   // ��� �ʵ�
	}
	
	Notebook(String company, String model) {
		this.model = model;
		this.company = company;  // ��� �ʵ�
	}
	//�޼ҵ�
	String model(String model) {
		this.model = model;
		return model;
	}
	
	 void connect(String name) {
		 System.out.println(name+"�� ����Ǿ����ϴ�.");		
	}
}
