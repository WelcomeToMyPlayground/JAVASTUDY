package sec04;

// 클래스
public class Travel {
	
	private int oil;   // 멤버 변수 선언
	private String location;
	
	// source로 자동완성
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	// 들어온 값이 감소
	void oilMinus (int x) {
		oil -= x;
	}
	
	// true, false를 while문에서 이용할 거임
	boolean isOilLeft() {
		if(oil<=0) {
			System.out.println("휘발유가 없어요. 여행 종료하세요");
			return false;
		}
		System.out.println("휘발유가 남았어요. 계속 여행하세요");
		return true;
	}	
}
