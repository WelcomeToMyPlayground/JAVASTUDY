package sec03.exam07;

public class 확인문제 {

	public static void main(String[] args) {
		
//		byte byteValue = 10;
//		char charValue = 'A';
//		
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		
//		double var = (double) intValue;
//		byte var2 = (byte) intValue;
//		int var3 = (int) doubleValue;
//		//char var4 = (char) strValue;
//		char var4 = strValue.charAt(0);
//		
//		System.out.println(var);
//		System.out.println(var2);
//		System.out.println(var3);
//		System.out.println(var4);
//		
//		byte byteValue = 10;
//		float floatValue = 2.5f;
//		double doubleValue2 = 2.5;
//		
//	//	byte result = byteValue + byteValue;
//		int result = byteValue + byteValue;
//		
		
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char) c2);
		
		int x = 5;
		int y = 2;
		int result3 = x / y;
		System.out.println(result3);  // 2가 출력됨
		
		double result4 = (double) x / y ;
		System.out.println(result4);  // 2.5가 출력됨
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int) var1+ (int) var2; // int로 강제변환하면 소수점 잘림
		System.out.println(result);
		

 }
}
