package º¸°­1024;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample{

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("c:/temp2/test1.db");
		
		while(true) {
			int data = is.read(); 
			if(data==-1) {	
				break;
			}
			System.out.println(data);
		}
		is.close();
	}

}
