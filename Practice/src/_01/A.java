package _01;

public class A {

	static String play() {
		int random = (int) (Math.random() * 5) + 1;
		String result = "";

		switch (random) {
		case 1:
			result = "µµ";
			break;
		case 2:
			result = "°³";
			break;
		case 3:
			result = "°É";
			break;
		case 4:
			result = "À·";
			break;
		default:
			result = "¸ð";
		}

		return result;
	}
}
