package chap09.sec01;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	static interface OnClickListener {
		void onClick();
	}
}
