package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();
		int [][] board = new int [5][5];
		
		for (int i = 0; set.size() < 25 ; i++) { //렘덤하게 번호를 가져온다
			set.add(new Random().nextInt(50) + 1); //(1~50까지 랜덤한 숫자 추출) + set(HashSet)에 넣어준다
			
			
		}
		Iterator<Integer> it = set.iterator(); //HashCode를 정렬해준다
		
		for (int i = 0; i < board.length; i++) {
			for (int j=0; j<board[i].length; j++) {
				board[i][j] = (int)it.next(); //오토박싱 //  board에 저장
				System.out.printf("%2d ", board[i][j]); //%2d 두자리에 맞춰서 나온다
				
			}
			
			
		}
		
		
		
	}

}
