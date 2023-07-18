package sec02;

public class a1 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2==v3); // true - int 1이 double 형태의 1.0으로 바뀐다
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);   // false - double이랑 float이라서
		System.out.println((float) v4 == v5);   // true

	}

}
