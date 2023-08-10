package sec01_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class writeExample2 {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:/temp/address2.txt");
		
		Scanner s = new Scanner(System.in);
		System.out.print("주소 입력 : ");
		String address = s.nextLine();
	
		writer.write(address,6,2);
		
		writer.flush();
		writer.close();

	}

}
