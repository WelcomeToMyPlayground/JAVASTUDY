package sec02;

public class 논리부정연산1 {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); // true
		
		play = !play;             //
		System.out.println(play); // false
		
		play = !play;             // false + false
		System.out.println(play); // true
	}

}
