package cardgame;

public class card {
	//attributes
	private char suit;
	private char rank;
	
	private static char [] SUITS = {'S', 'D', 'H', 'C'};
	private static char [] RANKS = {'A', '2','3','4','5','6','7','8','9','T','J','Q','K'};
	
	//methods
	//------- overload the constructor
	public card () {
		int num= (int)(Math.random() * SUITS.length);
		suit= SUITS[num];
		
		num= (int)(Math.random() * RANKS.length);
		rank= RANKS[num];
	}
	//constructor that assign specific values
	public card (char s, char r) {
		setSuit(s);
		setRank(r);
	}
	//set rank within our requirements
	public void setRank(char r) {
		for (int i= 0; i < RANKS.length; i++) {
			if (r== RANKS[i]) {
				rank = r;
				return;
			}
		}
		System.out.println("Rank not found in list");
	}
	//get rank
	public char getRank() {
		return rank;
	}
	
	//set suit within our requirements
	public void setSuit(char s) {
		for (int i= 0; i < SUITS.length; i++) {
			if (s== SUITS[i]) {
				suit = s;
				return;
			}
		}
		System.out.println("Suit not found in list");
	}
	//get suit
	public char getSuit() {
		return suit;
	}
	
	//to String Method
	public String toString() {
		String cardInfo = "Rank: " + rank + "\n" + "Suit: " + suit;
		return cardInfo;
	}
	
	public boolean isGreaterThan(card c) {
		//if index is bigger, card is bigger
		int index1=0;
		int index2=0;
		for (int i = 0; i < RANKS.length; i++){
			if(this.rank == RANKS[i]) {
				index1= i;
			}
			if (c.getRank()== RANKS[i]) {
				index2 = i;
			}
		}
		//if the index is bigger in ranks
		if(index1> index2) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEqualTo(card c) {
		int index1=0;
		int index2=0;
		for (int i = 0; i < RANKS.length; i++){
			if(this.rank == RANKS[i]) {
				index1= i;
			}
			if (c.getRank()== RANKS[i]) {
				index2 = i;
			}
		}
		//if the index is bigger in ranks
		if(index1 == index2) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
