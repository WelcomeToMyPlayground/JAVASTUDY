package classes;

class A {}
class B {}

public class ClassEx01 {

	public static void main(String[] args) {
		
		A objA = new A();
		B objB = new B();
		
		System.out.println(objA.getClass());
		System.out.println(objB.getClass());
		
		// °á°ú
		// class classes.A
		// class classes.B
		
		// 
	}

}
