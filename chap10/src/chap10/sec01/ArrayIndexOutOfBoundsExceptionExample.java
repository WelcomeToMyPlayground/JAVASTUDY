package chap10.sec01;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		// 일반적인 형태
		String[] a = new String[10];
		a[0] = "가나다";
		String data0 = a[0];
		System.out.println(data0);
		
		// 예외
		// args 라는 배열을 생성하지 않고 배열에 있는 값을 대입함
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);

	}

}
