package chap11.sec01;


public class IndexOfExample3 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.print("�ּҸ� �Է��ϼ���");
//		String oldAddress = s.nextLine();
//		
//		String newAddress = oldAddress.replace("����", "���ֱ�����");
//		System.out.println(oldAddress);
//		System.out.println(newAddress);
//		
		String name ="�ڹ� �ڹ� �ڹ� �ڹ� ���α׷���";
		name = name.replaceFirst("�ڹ�", "JAVA");
		System.out.println(name);
		name = name.replaceAll("�ڹ�", "java");
		System.out.println(name);
	}

}
