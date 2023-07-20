package chap09.sec01;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelcetListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	// 클래스 안 인터페이스 (중첩 인터페이스)
	static interface OnSelectListener {
		void onSelect();
	}
}
