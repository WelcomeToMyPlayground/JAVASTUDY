package chap12.sec01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<5;i++) {
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}
	}
		
		for(int i=0;i<5;i++) {
			System.out.print("��");
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {}
		}
	}
}
