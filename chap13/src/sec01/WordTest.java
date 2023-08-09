package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String engWord; // ���� �ܾ�
	private String korWord; // �ѱ� �ܾ�

	// �����ڸ� ���� ����� �ѱ� �ܾ� ������ �Է¹���
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	public String getEngWord() { // ���� �ܾ� ���ϸ޼ҵ�
		return engWord;
	}

	public String getKorWord() { // �ѱ� �ܾ� ���ϸ޼ҵ�
		return korWord;
	}
}

public class WordTest {
	Scanner s = new Scanner(System.in); // ��ĳ��
	List<Word> list = new Vector<>(); // ������ vector
	int[] question = new int[4]; // ���� ���� ������ �迭�� 4���� ����

	public WordTest() { // 17�� �ܾ� ¦�� vector�� �߰�

		list.add(new Word("love", "���"));
		list.add(new Word("society", "��ȸ"));
		list.add(new Word("animal", "����"));
		list.add(new Word("snow", "��"));
		list.add(new Word("feelings", "����"));
		list.add(new Word("stock", "�ֽ�"));
		list.add(new Word("doll", "����"));
		list.add(new Word("statue", "������"));
		list.add(new Word("honey", "��"));
		list.add(new Word("baby", "�Ʊ�"));
		list.add(new Word("bird", "��"));
		list.add(new Word("cat", "�����"));
		list.add(new Word("keyboard", "Ű����"));
		list.add(new Word("travle", "����"));
		list.add(new Word("rain", "��"));
		list.add(new Word("water", "��"));
		list.add(new Word("book", "å"));

	}

	public static void main(String[] args) {
		WordTest wordtest = new WordTest();
		wordtest.run();

	}

	private void run() {
		System.out.println("\"�������� �� ���߳�\"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("����"+list.size()+"���� �ܾ ����ֽ��ϴ�.");
		System.out.println();
		
		int num = 0; // ���� ���� ������ �����ϴ� ����
		
		while(true) {
			randomQuiz(); // ������ ���� ���� ���� �迭 ���� �޼ҵ� ȣ��
			int answerNumber = (int) (Math.random()*question.length);
			// 0~3 �� �� ���� ���� ��ȣ�� ����
			
			int answerIndex = question[answerNumber];
			// �����ȣ�� �迭�� �ִ� ���� ����
			
			System.out.println(list.get(answerIndex).getEngWord()+"?");
			// ������ ���� �ܾ ȣ���� ������ ������
			
			for(int i=0;i<question.length;i++) {
				// 4���� ���⸦ ����� ���� �ݺ���
				System.out.print("("+(i+1)+")"+list.get(question[i]).getKorWord()+" ");
				// 0~3 ���� �迭�� ���� �־� �� �ε����� ���� ���
			}
			System.out.println(">>");
			
			int input = s.nextInt();
			if (input == -1) {
				System.out.println("���ݱ���"+ num + "���� ������ ���߾����");
				System.out.println("������ �����մϴ�.");
				break;
			} else if (input -1 == answerNumber) { // �Է��� ���� 1 ~ 4 �̹Ƿ�
				System.out.println("����. ���߾��");
				System.out.println();
				num++;
			} else {
				System.out.println("����. ���� ������ �ϼ���");
				System.out.println();
			}
		}
	}

	private void randomQuiz() {
		// 4���� ���⿡ ������ ���� �ε����� �ֱ� ���� �޼ҵ�
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0 ~ ������ ���� (������ ������) �� ������ �� ����

			for (int j = 0; j < i; j++) { // �ߺ��� ���� ������ ó����
				if (question[i] == question[j]) {
					i--;
					continue;
				}

			}
		}
	}

}
