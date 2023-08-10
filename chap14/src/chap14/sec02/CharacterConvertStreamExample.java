package chap14.sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		
		write("문자 변환 스트림을 사용합니다.");
		// 메소드, 매개변수 문자열
		String data = read();
		// read() -> 메소드, 매개변수 x, 리턴 타입 String
		System.out.println(data);

	}

	private static String read() throws Exception{
		FileInputStream fis = new 	FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer,0,readCharNum);
		return data;
	}

	public static void write(String str) throws Exception { // write 메소드
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
		
	}

}
