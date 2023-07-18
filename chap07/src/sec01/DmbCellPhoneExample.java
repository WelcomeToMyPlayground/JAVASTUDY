package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbcellPhone = new DmbCellPhone("자바폰","검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드를 출력
		System.out.println("모델: " + dmbcellPhone.model);  
		System.out.println("색상: " + dmbcellPhone.color); 
		
		//DmbCellPhone 클래스의 필드를 출력
		System.out.println("채널: " + dmbcellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드를 호출
		dmbcellPhone.powerOn();
		dmbcellPhone.Bell();
		dmbcellPhone.sendVoice("안녕");
		dmbcellPhone.receiveVoice("안녕하세요.");
		dmbcellPhone.hangUp();
		
		//DmbCellPhone (본인)클래스의 메소드 호출
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(30);
		dmbcellPhone.turnOffDmb();
	}

}
