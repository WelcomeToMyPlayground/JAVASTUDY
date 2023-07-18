package sec02.exam07;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire st = new SnowTire();
		Tire tire = new SnowTire();
		
		
		st.run();
		st.condition="나쁨";
		System.out.println("타이어 마모 상태: " + st.condition);
		
		
		tire.run();
		tire.stop();

	}

}
