package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: "+ intValue);
		
		char charValue = '사';
		intValue = charValue;
		System.out.println("사의 유니코드 : " + intValue);
		
		//int가 long으로 자동 형변환
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		//long이 float으로 자동 형변환
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue :" + floatValue);
		
		
	}

}
