package chap09.sec01;

public class CheckBoxExample {

	public static void main(String[] args) {
	CheckBox checkBox =new CheckBox();
	checkBox.setOnSelcetListener(new BackgroundChangeListener());
	checkBox.select();

	}

}
