package chap11.sec01;

public class iPhone {
	
	String company;
	int cost;
	String model;
	
	public iPhone(String company, int cost, String model) {
		this.company = company;
		this.cost = cost;
		this.model = model;
	}

	@Override
	public String toString() {
		return (this.company+"�� �ֽ����� "+this.model+" ������ "+this.cost+"�� �Դϴ�.");
	}
		
}
