package chap13;

import java.util.ArrayList;
import java.util.List;


public class GesipanExample {

	public static void main(String[] args) {
		
		List<Gesipan> list = new ArrayList<>();
		
		list.add(new Gesipan(1,"8월 수업 일정", "자바 개인 프로젝트 발표","홍길동"));
		list.add(new Gesipan(2,"9월 수업 일정", "데이터 베이스","홍길동"));
		list.add(new Gesipan(3,"10월 수업 일정", "JSP","홍길동"));
		list.add(new Gesipan(4,"11월 수업 일정", "팀 프로젝트 준비","홍길동"));
		
		for(int i = 0; i<list.size(); i++) {
			Gesipan gesipan = list.get(i);  // 클래스(Gesipan) 타입 으로 받아야함
			System.out.println(gesipan.number+" "+gesipan.subject+" "+gesipan.content+" "+gesipan.user);
		}
	}

}
