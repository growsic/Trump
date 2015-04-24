package trump;
import java.util.ArrayList;

/**
 *トランプのデッキを保持するクラス
 * @author a13918
 *
 */
public class MainDeck extends Deck {

	/**jokerの枚数*/
	private int numOfJoker; 
	
	/**引数無しで初期化した場合、jokerは１枚*/
	public MainDeck() {
		this.numOfJoker = 1;
		this.deck = new ArrayList<>();
		mainDeckInit();
	}
	/**引数がnの場合、jokerはn枚*/
	public MainDeck(int numOfJoker) {
		this.numOfJoker = numOfJoker;
		this.deck = new ArrayList<>();
		mainDeckInit();
	}
	/**デッキの初期化*/
	private void mainDeckInit() {
		addAllCards();
	}
	
	/**デッキに５２枚の数字のカードとjokerを追加*/
	private void addAllCards() {
		for(Mark mark : Mark.values()){
			addSpecificMarkCards(mark, mark == Mark.JOKER ? numOfJoker : MaxNumberOfCards);
		}
	}
	/**指定されたマークの一連のカードdeckに追加するメソッド*/
	private void addSpecificMarkCards(Mark setMark, int numOfCards) {
		for(int i =1; i< numOfCards + 1; i++) {
			deck.add(new Card(setMark, i));
		}

	}

}
