class A{}
class B extends A{}

public class instanceofEx01 {

	public static void main(String[] args) {
		// "��ü + instanceof + Ŭ����"
		
		A a = new A();
		B b = new B();
		
		System.out.println("a instanceof A : " + (a instanceof A));  // true
		System.out.println("b instanceof A : " + (b instanceof A));  // true
		System.out.println("a instanceof B : " + (a instanceof B));  // false
		System.out.println("b instanceof B : " + (b instanceof B));  // true
	}

}
