package º¸°­1024;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample{

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("c:/temp2/test1.db");
		
		byte a = 10;
		byte b = 30;
		byte c = -1;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
