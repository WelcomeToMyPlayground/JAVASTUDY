package sec01;

public class NotebookExample {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("lg", 500, "20200820");
		
		notebook.powerOn();  // 부모 메소드 호출 
		
		String gamename = notebook.gamename("테런"); // 부모 메소드 호출 -리턴값 있어서 받아올 변수 필요
		System.out.println(gamename);
		
		System.out.println("노트북 모델명: " + notebook.model("LG그램"));
		
		 notebook.connect("에어팟"); // 호출하는 메소드가 void니까 받아올 변수가 필요없음
		 
		 notebook.powerOff(); // 부모 메소드 호출 
	}
}
