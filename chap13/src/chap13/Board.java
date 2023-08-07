package chap13;
// 게시물 정보 객체

public class Board {
	String subject; // 제목
	String content; // 내용
	String writer; // 글쓴이
	
	public Board(String subject, String content, String writer) { // 생성자
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	
}
