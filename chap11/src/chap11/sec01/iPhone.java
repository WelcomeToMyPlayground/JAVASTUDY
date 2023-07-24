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
		return (this.company+"의 최신폰인 "+this.model+" 가격은 "+this.cost+"원 입니다.");
	}
		
}
