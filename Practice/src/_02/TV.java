package _02;

public class TV {
	private String brand;
	private int year;
	private int size;
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(this.brand+"���� ���� "+this.year+"���� "+this.size+"��ġ TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("�Ｚ",2023,55);
		myTv.show();
	}
}
