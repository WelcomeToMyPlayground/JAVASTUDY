package sec02.exam01;

public class Truck extends Car{

	// ����ʵ�
	int weight;     	// ���� �뷮
	String trunkSize;   // Ʈ��ũ ������ (��/��/��)
	int maxSpeed;   	// �ִ� �ӵ�
	
	
	// ������ �����
	// ���� - 
	// �θ� Ŭ������ ����Ʈ �����ڰ� ��� ������ �� �־� ȣ�����ֱ� �ؾ��� 
	//	public Truck() {
	//		super();
	//	}
	
	
	// ������ 1: �Ű����� 2��, �θ�
	public Truck(String color, String company) {
		super(color, company);
	}
	
	// ������2 : �Ű����� 4�� (�θ� 2��, ���� 2��)
	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	
	// �޼ҵ�1 : �Ű����� 1��¥�� ���� �޼ҵ�, ����Ÿ�� x  
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	// �޼ҵ� �������̵�

	@Override
	void start() {
		System.out.println("Ʈ���� ����߽��ϴ�");
		
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ����ϴ�");
		
	}
}
