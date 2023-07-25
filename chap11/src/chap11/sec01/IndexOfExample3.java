package chap11.sec01;


public class IndexOfExample3 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.print("주소를 입력하세요");
//		String oldAddress = s.nextLine();
//		
//		String newAddress = oldAddress.replace("광주", "광주광역시");
//		System.out.println(oldAddress);
//		System.out.println(newAddress);
//		
		String name ="자바 자바 자바 자바 프로그래밍";
		name = name.replaceFirst("자바", "JAVA");
		System.out.println(name);
		name = name.replaceAll("자바", "java");
		System.out.println(name);
	}

}
