package chap11.sec01;

public class ResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1 = clazz.getResource("������.png").getPath();
		String photo2 = clazz.getResource("���������.jpg").getPath();
		System.out.println(photo1);
		System.out.println(photo2);

	}

}
