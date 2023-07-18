package sec02.exam04;

public class 응용문제1 {

	public static void main(String[] args) {
		
		
		System.out.println("");
		System.out.println(" ");    // 공백 출력
		
		System.out.println("1"+"2");
		System.out.println(true + "");     
		System.out.println('A'+'B');     // 유니코드 합
		System.out.println('A'); 
		System.out.println('1'); 
		System.out.println('1'+ 2);      // 유니코드 '1' ->  49
		System.out.println('1'+'2');     // 유니코드 49 + 50
		
		System.out.println('J'+ "ava"); // char + String => String
		// System.out.println('J'+ 'ava');  불가능 -> 'ava'가 String
		
		// System.out.println(true + null); 불가능 -> ture와 null은 더할 수 없음
		
		// boolean var = 0;  불가능
		
		// int v2 = le2; = 100.0 이니까 double

	}

}
