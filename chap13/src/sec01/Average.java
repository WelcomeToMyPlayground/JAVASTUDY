package sec01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		List <Character> list = new ArrayList<>();
		
		System.out.println("학점을 6번 입력하세요");
		System.out.println("A B C D E F 중에서 한 칸 띄우고 입력");
		
		for (int i=0;i<6;i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}
	}

}
