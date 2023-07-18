package sec02.exam04;

public class 실수연습1 {

	public static void main(String[] args) {

		// float var1 = 3.14;         float 타입은 반드시 뒤에 f 붙이기
		float var = 3.14f;
		double var2 = 3.14;

		System.out.println(var);
		System.out.println(var2);

		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;

		System.out.println(var4); // 반올림되어 결과가 나옴
		System.out.println(var5);
		
		double var6 = 3e6;
		float var7 = 3e6f;
		
		System.out.println(var6);
		System.out.println(var7);
		
		double var8 = 2e-3;
		System.out.println(var8);
		
		double var9 = 237e-4;
		System.out.println(var9);
		
		
	}

}
