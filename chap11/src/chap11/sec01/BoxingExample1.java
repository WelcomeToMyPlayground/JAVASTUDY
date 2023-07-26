package chap11.sec01;

public class BoxingExample1 {

	public static void main(String[] args) {
		
		// Wrapper 클래스 박싱(포장) : 기본 타입의 값을 포장 객체로 만드는 과정
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// Wrapper 클래스 언박싱(포장 해제) : 포장 객체에서 기본 타입의 값을 얻어내는 과정
		int value1 = obj1.intValue(); // 100
		int value2 = obj2.intValue(); // 200
		int value3 = obj3.intValue(); // 300
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		
		int num1 = 100;
		int num2 = 100;
				
		System.out.println(obj4==obj5); // false
		System.out.println(num1==num2); // true
		
	}

}
