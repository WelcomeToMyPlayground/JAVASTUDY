package sec01_1;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

public class writeExample {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:/temp/test8.txt");
		
		char[] array = {'A','B','C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}
