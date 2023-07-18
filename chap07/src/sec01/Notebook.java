package sec01;

public class Notebook extends Computer {
	// 멤버 필드
	String model;  // 노트북 모델명
	
	Notebook(String company, int price, String date) {
		this.company = company;  // 상속 필드
	    this.price = price;   // 상속 필드
	    this.date = date;   // 상속 필드
	}
	
	Notebook(String company, String model) {
		this.model = model;
		this.company = company;  // 상속 필드
	}
	//메소드
	String model(String model) {
		this.model = model;
		return model;
	}
	
	 void connect(String name) {
		 System.out.println(name+"에 연결되었습니다.");		
	}
}
