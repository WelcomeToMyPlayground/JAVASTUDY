package chap11.sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		// Integer obj = new Integer(100);  정식 코드
		// 대입 값이 int 타입이면 자동으로 박싱해줌
		
		Integer obj = 100;
		System.out.println(obj); // 100 출력
		
		// int value = obj.intValue();  정식 언박싱 코드
		// 대입값이  int 타입이면 자동으로 언박싱해줌
		int value = obj;
		System.out.println(value); // 100 출력
		
		// 
		Integer obj2 = new Integer("100"); // obj2는 Wrapper 타입 클래스임
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt는 String 타입을 Int 타입으로 변경
		// obj2가 String 타입이 아니므로 사용 불가능
		
		int value2 = Integer.valueOf(obj2);
		// valueOf를 이용해야 가능함
		
		int value3 = Integer.parseInt("300");
		System.out.println(value3); // 300 출력
	}  
	
}
