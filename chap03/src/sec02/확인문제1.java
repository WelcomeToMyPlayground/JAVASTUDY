package sec02;

public class 확인문제1 {

	public static void main(String[] args) {
	
		//원본(불가능)
		
//		byte b = 5;
//		b = -b;
//		int result 10/b;
//		System.out.println(result);
//		

		//1 - 변수를 변경
		byte b = 5;
		int a = -b;
		int result = 10/a;
		System.out.println(result);
		
		//2 - byte를 int로 변경
		int e = 5;
		e = - e;
		int result1 = 10/e;
		System.out.println(result);
	}

}
