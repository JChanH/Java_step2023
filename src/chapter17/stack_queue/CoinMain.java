package chapter17.stack_queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		//stack에서는 push로 정보를 넣어준다
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		System.out.println(!coinBox.isEmpty()); // 비어있지 않아서 false이지만 반대! 라서  true

		while (!coinBox.isEmpty()) { //코인이 있는 동안에는 계속 돈다 
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());

		}

	}

}
