package chap12.sec01;
// ���� ��ü 
public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return getMemory();
	}
	
	public void setMemory(int memory) { // ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory; // �Ű����� memory �ʵ忡 ����
		try {
			Thread.sleep(2000);  // �����带 2�ʰ� �Ͻ� ������Ŵ
		} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}
}
