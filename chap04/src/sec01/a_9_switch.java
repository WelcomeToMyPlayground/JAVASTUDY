package sec01;

public class a_9_switch {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*4)+8 ;
		System.out.println("[현재 시각: " + num + "시]");
		
		switch (num) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	}

}
