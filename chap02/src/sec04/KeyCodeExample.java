package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		// throws Exception은 예외상황을 화면에 출력함
		
		int keyCode = System.in.read();
		System.out.println("키코드: " + keyCode);  // 입력 시 해당하는 키코드가 출력된다
		keyCode = System.in.read();
		System.out.println("키코드: " + keyCode); 
		keyCode = System.in.read();
		System.out.println("키코드: " + keyCode); 
	}

}
