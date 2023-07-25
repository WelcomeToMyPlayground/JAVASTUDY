package chap11.sec01;

public class IndexOfExample {

	public static void main(String[] args) {
		String str1 ="나는 자바를 사랑합니다.";
		
		int index = str1.indexOf("사랑합니다");
		// int index = str1.indexOf("코드");  // -1 출력 (해당 문자가 없을시 -1이 출력된다)
		System.out.println(index);  // 7출력 (인덱스 시작 위치를 출력: "사" 부터 ~) 

	}

}
