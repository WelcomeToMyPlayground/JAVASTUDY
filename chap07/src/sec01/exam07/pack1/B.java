package sec01.exam07.pack1;

public class B {
	// A�� B�� ���� ��Ű�� 
	public void method() {
		// protected�� ���� ��Ű�������� �����Ӱ� ���� ������!!
		A a = new A();
		a.field = "value";
		a.method();
	}
}
