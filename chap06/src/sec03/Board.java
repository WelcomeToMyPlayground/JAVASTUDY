package sec03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	Board(String title, String content) {	
		// ȣ��
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);	
	}

	Board(String title, String content, String writer) {  
		// ȣ��
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);	
			}

	Board(String title, String content, String writer, String date) {
		// ȣ��
		this(title, content, writer, date, 0);	
		
	}

	public Board(String title, String content, String writer, String date, int hitcount) {
		// ���� ���� �ڵ� 
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

		
}
