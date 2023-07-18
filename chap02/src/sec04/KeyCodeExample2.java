package sec04;

public class KeyCodeExample2 {

	public static void main(String[] args) throws Exception {
		
		// throws Exception은 예외상황을 화면에 출력함
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("키코드 : " + keyCode);
			
			if(keyCode==113)     // 키코드 값이 113이면 반복문 탈출
				break;
		}
	}
		// while 무한 반복
}
