package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		
		GasCar myCar = new GasCar();
		
		myCar.setGas(5);  // Car의 SetGas() 메소드 호출 -> 5를 집어넣음
		
		boolean gasState = myCar.isLeftGas();  //  Car의 isLeftGasGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
