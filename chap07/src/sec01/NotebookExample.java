package sec01;

public class NotebookExample {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("lg", 500, "20200820");
		
		notebook.powerOn();  // �θ� �޼ҵ� ȣ�� 
		
		String gamename = notebook.gamename("�׷�"); // �θ� �޼ҵ� ȣ�� -���ϰ� �־ �޾ƿ� ���� �ʿ�
		System.out.println(gamename);
		
		System.out.println("��Ʈ�� �𵨸�: " + notebook.model("LG�׷�"));
		
		 notebook.connect("������"); // ȣ���ϴ� �޼ҵ尡 void�ϱ� �޾ƿ� ������ �ʿ����
		 
		 notebook.powerOff(); // �θ� �޼ҵ� ȣ�� 
	}
}
