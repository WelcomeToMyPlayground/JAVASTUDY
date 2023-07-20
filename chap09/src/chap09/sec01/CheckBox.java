package chap09.sec01;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelcetListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	// Ŭ���� �� �������̽� (��ø �������̽�)
	static interface OnSelectListener {
		void onSelect();
	}
}
