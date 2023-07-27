package chap12.sec01;
// User1 ½º·¹µå
public class User1 extends Thread {
	
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	
	
}
