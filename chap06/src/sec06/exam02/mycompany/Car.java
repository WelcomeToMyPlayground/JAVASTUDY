package sec06.exam02.mycompany;  // 현재 파일의 패키지 이름

import sec06.exam02.hankook.*;	 // 다른 패키지를 끌어올 때 import 선언
import sec06.exam02.kumho.*;

public class Car {
	
	SnowTire tire1 = new SnowTire();
	// Tire tire2 = new Tire();   // 어느 패키지의 Tire 파일인지 알 수 없음, 똑같은 이름의 클래스를 2개 import시킴

	// 경로명까지 적어줄 것
	// 자동 import 단축키: ctrl + shift+ o
	
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	
}
