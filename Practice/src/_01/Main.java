package _01;

class Static{
	
	public int a = 20;
	static int b = 0;

}

public class Main{
	public static void main(class������[] args) {
		
		int a;
		a = 10;
		Static.b = a;  // 10�� �־���
		
		Static st = new Static();
		
		System.out.println(Static.b++);  // 10
		System.out.println(st.b);		 // 11
		System.out.println(a);			 // 10
		System.out.println(st.a);		 // 20
		
	}
}
