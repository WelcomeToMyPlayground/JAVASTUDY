package sec02.exam01;

public class Truck extends Car{

	// 멤버필드
	int weight;     	// 적재 용량
	String trunkSize;   // 트렁크 사이즈 (대/중/소)
	int maxSpeed;   	// 최대 속도
	
	
	// 생성자 만들기
	// 에러 - 
	// 부모 클래스에 디폴트 생성자가 없어서 무조건 값 넣어 호출해주긴 해야함 
	//	public Truck() {
	//		super();
	//	}
	
	
	// 생성자 1: 매개변수 2개, 부모만
	public Truck(String color, String company) {
		super(color, company);
	}
	
	// 생성자2 : 매개변수 4개 (부모 2개, 본인 2개)
	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	
	// 메소드1 : 매개변수 1개짜리 고유 메소드, 리턴타입 x  
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	// 메소드 오버라이딩

	@Override
	void start() {
		System.out.println("트럭이 출발했습니다");
		
	}

	@Override
	void stop() {
		System.out.println("트럭을 멈춥니다");
		
	}
}
