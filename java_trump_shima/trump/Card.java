package trump;

/**
 * トランプの１枚のカードの情報を保持するクラス
 * @author a13918
 *
 */
public class Card {
	private Mark mark;//トランプのマーク
	private int number;//jokerの場合は何枚目のジョーカーかを格納
	
	/*コンストラクタ*/
	public Card(Mark mark, int number) {
		this.mark = mark;
		this.number = number;
	}
	/*カードのマークを取得*/
	public Mark getMark() {
		return this.mark;
	}
	/*カードの数字を取得*/
	public int getNumber() {
		return this.number;
	}
	
}
