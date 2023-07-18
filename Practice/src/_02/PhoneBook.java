package _02;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	Phone phone[];
	// 클래스 타입의 배열 생성, 개수는 아직 정해지지 않음
	
	System.out.print("인원수 >> ");
	int num = s.nextInt();
	phone = new Phone[num];
	// 인원수를 받아들여 그 수만큼 클래스 타입의 배열 생성함
	
	int i; // 전역변수 i를 선언함
	
	for(i=0; i<phone.length;i++) {
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
		String name = s.next();
		String tel = s.next();
		phone[i] = new Phone(name, tel);	
	}
	System.out.println("저장되었습니다...");
	
	while(true) {
		System.out.print("검색할 이름 >>");
		String name = s.next();
		for(i =0; i <num; i++) {
			if (name.equals(phone[i].getName())) {
				System.out.println(name+"의 번호는 " + phone[i].getPhoneNumber()+"입니다.");
				break;	// 찾는 데이터가 있으면 이름과 번호를 출력 후 for문 종료			
			}
		}
		if (name.equals("그만")) {
			break; // 그만을 입력하면 while문 종료
		}	
		if (i == num) // 찾는 데이터가 없으면 없다는 안내문 출력
			System.out.println(name+"이 없습니다.");
	} 

	}

}
