package sec01.exam02;

public class computer2 extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer2�� areaCircle() ����");
		return Math.PI * r * r;
	}

}
