package sec02;

public class 연산자1 {

	public static void main(String[] args) {
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1); // 100
		System.out.println(result2); // -100
		
		// byte result3 = -b;    byte에 - 붙이면 int로 변경됨
		byte b =100;
		int result4 = -b;
		System.out.println(result4); // -100

	}

}
