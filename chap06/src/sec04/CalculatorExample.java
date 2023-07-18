package sec04;

// 실행
public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator  myCalc = new Calculator() ;   // 기본 생성자 
		
		myCalc.println("가나다");         // 리턴값 x , 내부호출 x (그냥 호출하면 된다)
		
//		myCalc.plus(6, 4);       		  // X
		int result1 = myCalc.plus(6, 4);  // return값이 있으니까 받아와야함
		System.out.println(result1);	  // 출력 ( 리턴값 o, 내부호출 x)
		
//		myCalc.avg(10, 15);
		double result2 = myCalc.avg(10, 15);  // 리턴값 o, 내부호출 o
		System.out.println(result2);
		
		myCalc.excute();   				 	  //  리턴값 x, 내부호출 3번 
        // void - 리턴값 없어서 호출하고 끝남 // avg 호출, plus 호출, println 호출 => 3
		
		
	}

}
