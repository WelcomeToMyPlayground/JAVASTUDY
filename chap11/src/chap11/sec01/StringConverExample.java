package chap11.sec01;

public class StringConverExample {

	public static void main(String[] args) {
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);  // 문자열 "200"을 정수로 변환
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); // 숫자 150을 문자열로 변환
		
		System.out.println(intData1); // 200
		System.out.println(strData2); // 150

	}

}
