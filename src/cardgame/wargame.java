package cardgame;

public class wargame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		card c1 = new card ();
		System.out.println(c1);
		
		char rank = 'S';
		char suit = 'D';
		card c2 = new card(suit,rank);
		System.out.println(c2);
		*/
		//War game
		int player1 = 0;
		int player2=0;
		for (int i =0; i< 20; i++) {
			card c1= new card();
			card c2 = new card();
		System.out.println("Card 1: " + c1);
		System.out.println("Card 2: " + c2);
		
		if(c1.isEqualTo(c2)) {
			System.out.println("Tie");
		}
		else if(c1.isGreaterThan(c2)) {
			player1++;
		}else {
			player2++;
		}
		System.out.println("player 1 score: " + player1);
		System.out.println("player 2 score: " + player2);
		System.out.println(" ");
	}
	}
}
