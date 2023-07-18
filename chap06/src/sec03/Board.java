package sec03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	Board(String title, String content) {	
		// 호출
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);	
	}

	Board(String title, String content, String writer) {  
		// 호출
		this(title, content, writer, "현재 컴퓨터 날짜", 0);	
			}

	Board(String title, String content, String writer, String date) {
		// 호출
		this(title, content, writer, date, 0);	
		
	}

	public Board(String title, String content, String writer, String date, int hitcount) {
		// 공통 실행 코드 
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

		
}
