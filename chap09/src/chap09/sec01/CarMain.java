package chap09.sec01;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();				  // A a = new A();
		Car.OldCar oldcar = car.new OldCar(); // A.B b = a.new B();
		
		car.cost=5000;
		car.speedUp(30);
		
		oldcar.cost=3000;
		oldcar.speedUp(50);
		oldcar.carCall();
		
		System.out.println(car.cost);
		System.out.println(car.speed);
		System.out.println(oldcar.cost);
		System.out.println(car.speed);
		
		// Á¤Àû
		Car.Truck truck= new Car.Truck();	// A.C c = new A.C();
		truck.cost=6000;
		truck.speedUp(100);
		System.out.println(truck.cost);
		System.out.println(truck.speed);
	}

}
