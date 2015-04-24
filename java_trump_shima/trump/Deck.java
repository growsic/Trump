package trump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Deckの抽象クラス
 * 山札や手札などのクラスの元となる
 * 拡張性を意識して。
 * @author a13918
 *
 */
abstract class Deck {
	/**トランプの数字の最大数*/
	protected static final int MaxNumberOfCards = 13;
	/**カードを保持するリスト*/
	protected List<Card> deck;
	
	
	public Deck() {
		deck = new ArrayList<>();
	}
	
	/**デッキのシャッフル*/
	public void shaffuleCards() {
		 Collections.shuffle(deck);
	}
	
	/**deckのすべてのカードを表示*/
	public void showAllCards() {
		Card tmpCard;
		for(int i = 0; i < deck.size(); i++){
			tmpCard = deck.get(i);
			System.out.println("mark:" + tmpCard.getMark() + " num:" + tmpCard.getNumber());
		}
	}
	
	/**deckの残り枚数を返す*/
	public int getNumOfCards() {
		return deck.size();
	}

	/**自分のdeckから引いたカードを返す。
	 * デッキがなかったらnullを返す
	 * 複数枚まとめての処理は未実装
	 */
	
	/**引数がない場合は0番目を返す*/
	public Card passCard() {
		return !deck.isEmpty() ? deck.remove(0) : null;
	}
	/**引数がintの時はその番号のcardを返す*/
	public Card passCard(int num) {
		return deck.size() > num && num > 0 ? deck.remove(num) : null;
	}
	/**引数がCardの時は,deckにあればそのカードを返す*/
	public Card passCard(Card card) {
		int cardIndex = deck.indexOf(card);
		return cardIndex != -1 ? deck.remove(cardIndex) :null;
	}
	
	/**引数のカードを自分のdeckに追加する */
	public void addCard(Card card) {
		deck.add(card);
	}
	
}
