package 보강1024;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp2/test3.txt");
		
		Scanner s = new Scanner(System.in);
		String [] names = new String[5];	// 길이가 5인 문자열 배열 'names' 생성
		
		for(int i=0; i < names.length; i++) {	// 5번 반복
			System.out.print("이름을 입력하세요");
			names[i] = s.next();	// Scanner 객체 s를 사용하여 사용자로부터 키보드로 입력한 문자열을 읽고, 그 문자열을 배열 names의 i번째 요소에 저장
			writer.write(names[i]+"\n");
			// 입력받은 이름을 writer를 사용하여 파일에 쓰고, 각 이름 사이에 줄 바꿈 문자(\n)를 추가하여 각 이름을 새로운 줄에 쓰도록 함
		}
		
		writer.flush(); // 버퍼에 있는 data를 파일에 강제로 출력함
		writer.close();	// 파일 출력 스트림을 닫는 메서드 . 파일에 대한 연결이 종료됨
	}
}
