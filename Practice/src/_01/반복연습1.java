package _01;

public class 반복연습1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int i = 1;
		
		sum= 0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
