package sec01;

public class Computer {

	// 멤버 필드 
	String company;
	int price;
	String date;
	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 끕니다");}
	void On() {System.out.println("인터넷에 연결합니다");}
	void game() {System.out.println("게임을 합니다");}
	
	String gamename(String gamename) {
		String result = gamename + "을 합니다";
		return result;
	}
	
	
}
