package 보강1024;


import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample2{

	public static void main(String[] args) throws Exception{
		// 파일 출력 스트림 생성
		// 'FileWriter' 클래스는 파일에 문자를 쓰기 위한 스트림을 열고,
		// "c:/temp2/test2.txt" 경로에 파일을 생성하거나 열게 됨
		// 이 스트림은 변수 'wr'에 할당됨
		Writer wr = new FileWriter("c:/temp2/test2.txt");
		
		char a = '가';
		char b = '나';
		char c = '다';
		
		String d = "영권이바보";
		
		// 아래 문자 변수들을 파일 스트림에 쓰는 부분
		// wr.write() 메서드를 사용하여 문자를 파일에 씀
		wr.write(a);
		wr.write(b);
		wr.write(c);
		wr.write(d);
		
		wr.flush(); // 버퍼에 남아있는 데이터를 강제로 출력
		wr.close();	// 파일 출력 스트림을 닫는 메서드 (파일을 닫으면 파일에 대한 연결 종료)
	}

}
