package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbcellPhone = new DmbCellPhone("�ڹ���","����", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ带 ���
		System.out.println("��: " + dmbcellPhone.model);  
		System.out.println("����: " + dmbcellPhone.color); 
		
		//DmbCellPhone Ŭ������ �ʵ带 ���
		System.out.println("ä��: " + dmbcellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ带 ȣ��
		dmbcellPhone.powerOn();
		dmbcellPhone.Bell();
		dmbcellPhone.sendVoice("�ȳ�");
		dmbcellPhone.receiveVoice("�ȳ��ϼ���.");
		dmbcellPhone.hangUp();
		
		//DmbCellPhone (����)Ŭ������ �޼ҵ� ȣ��
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.changeChannelDmb(30);
		dmbcellPhone.turnOffDmb();
	}

}
