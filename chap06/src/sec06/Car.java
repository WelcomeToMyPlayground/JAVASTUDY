package sec06;

import java.util.Scanner;

//
public class Car {

	// 필드
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

	// 색상 변경
	public void setColor() {
		System.out.println("자동차 색상을 입력해주세요");
		String changeColor = s.next();
		Color = changeColor;
		System.out.println("자동차 색상: " + getColor());
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed() {
		System.out.println("키를 눌러주세요. a는 속도 증가, s는 속도 감소");
		String key = s.next();
		
		System.out.println("속도를 입력해주세요");
		int changeSpeed = s.nextInt();
		int presentSpeed = getSpeed();
		 
		if(key.equals("s") && presentSpeed< changeSpeed) {
			System.out.println("속도는 마이너스가 될 수 없습니다.");
		} else if(key.equals("s") && presentSpeed >= changeSpeed) {
			Speed -= changeSpeed;
			System.out.println("현재 속도: " + getSpeed());
		} else {
			Speed += changeSpeed;
			System.out.println("현재 속도: " + getSpeed());
		}
		
	// 속도 변경
//	public void setSpeed(String key, int speed) {
//		int presentSpeed = getSpeed();
//		if (key.equals("s") && presentSpeed == 0) {
//			System.out.println("현재 속도가 0 입니다.");
//		} else if (key.equals("s") && presentSpeed != 0) {
//			speed -= speed;
//		} else {
//			speed += speed;
//		}

	}
}
