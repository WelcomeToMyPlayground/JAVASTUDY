package chap11.sec01;

public class ResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1 = clazz.getResource("개구리.png").getPath();
		String photo2 = clazz.getResource("랙돌고양이.jpg").getPath();
		System.out.println(photo1);
		System.out.println(photo2);

	}

}
