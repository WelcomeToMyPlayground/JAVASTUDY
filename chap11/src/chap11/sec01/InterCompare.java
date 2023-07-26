package chap11.sec01;

public class InterCompare {

	public static void main(String[] args) {
		// Integer num1 = new Integer(100);    // Á¤½Ä ¹Ú½Ì ÄÚµå
		
		// ÀÚµ¿ ¹Ú½Ì
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 300;
		Integer num4 = 300;
		
		System.out.println(num1==num2);  // true
		System.out.println(num3==num4);	 // false
		System.out.println(num3.equals(num4)); // true
	}

}
