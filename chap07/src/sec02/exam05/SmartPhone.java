package sec02.exam05;

public class SmartPhone extends Phone {
	boolean touch;
	String Camera;
	String Phonecase;
	String protectedFilm;
	int cost=200000; 
	
	@Override
	void ring() {
		System.out.println("스마트폰이 울립니다");
	}
	
	void videoOn() {
		System.out.println("동영상을 촬영합니다");
	}
	
	void CameraOn() {
		System.out.println("사진을 촬영합니다");
	}
	
}
