package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {
		
		계산기 myCalc = new 계산기();
		myCalc.powerOn();  // 호출
		
		int result1 = myCalc.plus(5, 3);
		System.out.println(result1);   // 8
		
		int result2 = myCalc.minus(3, 5);   
		System.out.println(result2);   // 2
		
		int result3 = myCalc.mul1(3, 5);   
		System.out.println(result3);   
		
		
		// 둘 중 값이 하나라도 0이면
		// "0은 입력할 수 없습니다"를 출력
		String result4 = myCalc.mul(0, 5);
		System.out.println(result4);   
		
		double result5 = myCalc.divide(5, 2);
		System.out.println(result5);
		
		//작 -> 큰  자동 형변환 
		byte x = 10;
		byte y = 4;
		double result6 = myCalc.divide(x, y);
		System.out.println(result6);}

}
