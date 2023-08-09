package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String engWord; // 영어 단어
	private String korWord; // 한글 단어

	// 생성자를 통해 영어와 한글 단어 쌍으로 입력받음
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	public String getEngWord() { // 영어 단어 리턴메소드
		return engWord;
	}

	public String getKorWord() { // 한글 단어 리턴메소드
		return korWord;
	}
}

public class WordTest {
	Scanner s = new Scanner(System.in); // 스캐너
	List<Word> list = new Vector<>(); // 저장방식 vector
	int[] question = new int[4]; // 문제 보기 저장할 배열은 4개로 지정

	public WordTest() { // 17개 단어 짝을 vector에 추가

		list.add(new Word("love", "사랑"));
		list.add(new Word("society", "사회"));
		list.add(new Word("animal", "동물"));
		list.add(new Word("snow", "눈"));
		list.add(new Word("feelings", "감정"));
		list.add(new Word("stock", "주식"));
		list.add(new Word("doll", "인형"));
		list.add(new Word("statue", "조각상"));
		list.add(new Word("honey", "꿀"));
		list.add(new Word("baby", "아기"));
		list.add(new Word("bird", "새"));
		list.add(new Word("cat", "고양이"));
		list.add(new Word("keyboard", "키보드"));
		list.add(new Word("travle", "여행"));
		list.add(new Word("rain", "비"));
		list.add(new Word("water", "물"));
		list.add(new Word("book", "책"));

	}

	public static void main(String[] args) {
		WordTest wordtest = new WordTest();
		wordtest.run();

	}

	private void run() {
		System.out.println("\"누가누가 잘 맞추나\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재"+list.size()+"개의 단어가 들어있습니다.");
		System.out.println();
		
		int num = 0; // 맞춘 정답 개수를 저장하는 변수
		
		while(true) {
			randomQuiz(); // 랜덤한 값을 가진 문제 배열 생성 메소드 호출
			int answerNumber = (int) (Math.random()*question.length);
			// 0~3 중 한 값을 정답 번호로 저장
			
			int answerIndex = question[answerNumber];
			// 정답번호의 배열에 있는 값이 정답
			
			System.out.println(list.get(answerIndex).getEngWord()+"?");
			// 정답의 영어 단어를 호출해 문제로 출제함
			
			for(int i=0;i<question.length;i++) {
				// 4개의 보기를 만들기 위한 반복문
				System.out.print("("+(i+1)+")"+list.get(question[i]).getKorWord()+" ");
				// 0~3 까지 배열에 값을 넣어 각 인덱스의 보기 출력
			}
			System.out.println(">>");
			
			int input = s.nextInt();
			if (input == -1) {
				System.out.println("지금까지"+ num + "개의 정답을 맞추었어요");
				System.out.println("게임을 종료합니다.");
				break;
			} else if (input -1 == answerNumber) { // 입력한 값은 1 ~ 4 이므로
				System.out.println("정답. 잘했어요");
				System.out.println();
				num++;
			} else {
				System.out.println("오답. 공부 열심히 하세요");
				System.out.println();
			}
		}
	}

	private void randomQuiz() {
		// 4개의 보기에 임의의 벡터 인덱스를 주기 위한 메소드
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0 ~ 문제의 개수 (벡터의 사이즈) 중 임의의 값 저장

			for (int j = 0; j < i; j++) { // 중복된 값은 없도록 처리함
				if (question[i] == question[j]) {
					i--;
					continue;
				}

			}
		}
	}

}
