package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;
	
	//������
	SuperCar(String model, String company, int maxSpeed) {
		super(model, company);
		this.maxSpeed = maxSpeed;
	}
}
