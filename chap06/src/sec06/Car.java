package sec06;

import java.util.Scanner;

//
public class Car {

	// �ʵ�
	private String Name;
	private String Company;
	private String Color;
	private int Speed = 50;

	Scanner s = new Scanner(System.in);
	public Car(String name, String company, String color, int speed) {

		this.Name = name;
		this.Company = company;
		this.Color = color;
		this.Speed = speed;
	}

	public Car() {

	}

	public String getColor() {
		return Color;
	}

	// ���� ����
	public void setColor() {
		System.out.println("�ڵ��� ������ �Է����ּ���");
		String changeColor = s.next();
		Color = changeColor;
		System.out.println("�ڵ��� ����: " + getColor());
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed() {
		System.out.println("Ű�� �����ּ���. a�� �ӵ� ����, s�� �ӵ� ����");
		String key = s.next();
		
		System.out.println("�ӵ��� �Է����ּ���");
		int changeSpeed = s.nextInt();
		int presentSpeed = getSpeed();
		 
		if(key.equals("s") && presentSpeed< changeSpeed) {
			System.out.println("�ӵ��� ���̳ʽ��� �� �� �����ϴ�.");
		} else if(key.equals("s") && presentSpeed >= changeSpeed) {
			Speed -= changeSpeed;
			System.out.println("���� �ӵ�: " + getSpeed());
		} else {
			Speed += changeSpeed;
			System.out.println("���� �ӵ�: " + getSpeed());
		}
		
	// �ӵ� ����
//	public void setSpeed(String key, int speed) {
//		int presentSpeed = getSpeed();
//		if (key.equals("s") && presentSpeed == 0) {
//			System.out.println("���� �ӵ��� 0 �Դϴ�.");
//		} else if (key.equals("s") && presentSpeed != 0) {
//			speed -= speed;
//		} else {
//			speed += speed;
//		}

	}
}
