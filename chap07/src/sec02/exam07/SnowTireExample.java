package sec02.exam07;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire st = new SnowTire();
		Tire tire = new SnowTire();
		
		
		st.run();
		st.condition="����";
		System.out.println("Ÿ�̾� ���� ����: " + st.condition);
		
		
		tire.run();
		tire.stop();

	}

}
