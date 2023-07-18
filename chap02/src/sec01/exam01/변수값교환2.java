package sec01.exam01;

public class 변수값교환2 {

	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 30;
		
		a = c - a;          // 30 - 10 = 20
		c = a + b + 10;     // 20 + 20 + 10 = 50
		b = c + a;          // 50 + 20 = 70
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}