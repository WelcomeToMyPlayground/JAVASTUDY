package sec01;

public class Computer {

	// ��� �ʵ� 
	String company;
	int price;
	String date;
	
	void powerOn() {System.out.println("������ �մϴ�");}
	void powerOff() {System.out.println("������ ���ϴ�");}
	void On() {System.out.println("���ͳݿ� �����մϴ�");}
	void game() {System.out.println("������ �մϴ�");}
	
	String gamename(String gamename) {
		String result = gamename + "�� �մϴ�";
		return result;
	}
	
	
}
