package sec01.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();   // 부모
		System.out.println("원의 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		computer2 computer = new computer2();		// 자식
		System.out.println("원의 면적: " + computer.areaCircle(r)); // 자식 클래스에서 재정의된 메소드를 호출
		System.out.println();
		
		//출력결과
		//Calculator의 areaCircle() 실행
		//원의 면적: 314.159

		//Computer2의 areaCircle() 실행
		//원의 면적: 314.1592653589793

	}

}
