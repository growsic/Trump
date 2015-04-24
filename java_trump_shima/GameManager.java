import trump.*;
/**
 * Debug用Mainクラス
 * @author a13918
 *
 */
public class GameManager {
	private static final int
	NOMBER_OF_JOKER = 2;
	public static void main(String[] args) {
		MainDeck deck = new MainDeck(NOMBER_OF_JOKER);//create trump deck
		/*初期カードの表示*/
		deck.showAllCards();
		/*カードのシャッフル*/
		deck.shaffuleCards();
		/*シャッフル結果を確認*/
		System.out.println("===============");
		System.out.println("after shuffuled");
		deck.showAllCards();
		
		System.out.println(deck.getNumOfCards());
	}

}
