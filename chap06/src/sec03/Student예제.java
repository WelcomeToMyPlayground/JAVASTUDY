package sec03;

public class Student���� {

	public static void main(String[] args) {

		Student1 student1 = new Student1();
		System.out.println(student1.name);
		System.out.println(student1.age);

		Student1 student2 = new Student1("ȫ����", 30);
		System.out.println(student2.name);
		System.out.println(student2.age);
		
		Student1 student3 = new Student1("ȫ�浿", "20231111", "010-5555-7777");
		System.out.println(student3.name);
		System.out.println(student3.studentNumber);
		System.out.println(student3.phoneNumber);

	}
}