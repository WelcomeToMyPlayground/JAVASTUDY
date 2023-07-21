package chap10.sec02;

public class TryCatchFinallyExample4 {

	public static void main(String[] args) {
		
		try {
			//String data1 = args[0];
			//String data2 = args[1];
			
			String data1 = "가나";
			String data2 = "다라";
			
			//String data1 = "123";
			//String data2 = "456";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println("두 수의 합은 : " + result);
		} catch (Exception e) {
			System.out.println("오류 발생 했지롱!!!");
		}

	}

}
