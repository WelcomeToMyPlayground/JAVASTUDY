package _01;

public class A {

	static String play() {
		int random = (int) (Math.random() * 5) + 1;
		String result = "";

		switch (random) {
		case 1:
			result = "��";
			break;
		case 2:
			result = "��";
			break;
		case 3:
			result = "��";
			break;
		case 4:
			result = "��";
			break;
		default:
			result = "��";
		}

		return result;
	}
}
