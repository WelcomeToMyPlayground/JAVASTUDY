package sec03;

public class Card {

		private String cardName;
		
		public Card() {        // 기본 생성자
			this("현대");      
		}
		
		public Card(String cardName) {
			this.cardName = cardName;
		}
		
		public void getCard() {
			System.out.println("카드사는 " + this.cardName + "입니다.");
		}
		
		
	public static void main(String[] args) {
		
		Card card1 = new Card();
		Card card2 = new Card("삼성");  // 매개변수 입력
		
		card1.getCard();   // 호출
		card2.getCard();

	}

}
