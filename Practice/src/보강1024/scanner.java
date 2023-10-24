package 보강1024;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) throws Exception {
		Writer wr = new FileWriter("c:/temp2/test2.txt");
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 이름은?");
		String name = s.next();
		
		wr.write(name);
		wr.flush();
		wr.close();

	}
}
