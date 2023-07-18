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
		System.out.println(this.brand+"에서 만든 "+this.year+"년형 "+this.size+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("삼성",2023,55);
		myTv.show();
	}
}
