package sec01.exam07.pack1;

public class B {
	// A와 B는 같은 패키지 
	public void method() {
		// protected는 같은 패키지에서는 자유롭게 접근 가능함!!
		A a = new A();
		a.field = "value";
		a.method();
	}
}
