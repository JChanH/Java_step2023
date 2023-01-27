package chapter17.vector;

import java.util.List;
import java.util.Vector;

public class BoardMain {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", " 내용1", "글쓴이1"));
		list.add(new Board("제목2", " 내용2", "글쓴이2"));
		list.add(new Board("제목3", " 내용3", "글쓴이3"));
		list.add(new Board("제목4", " 내용4", "글쓴이4"));
		list.add(new Board("제목5", " 내용5", "글쓴이5"));
		
		for (int i = 0; i<list.size() ; i++) {
			Board board = list.get(i);  //리스트에서 객체를 꺼내서 Board의 객체로 다시 만들어 준다 (매게변수 생성)
			System.out.println(board.subject + "\t" + board.contect+ "\t" +board.writer);
		}
		
		list.remove(2);
		list.remove(2);
		System.out.println("-----------------");
		for (int i = 0; i<list.size() ; i++) {
			Board board = list.get(i); 
			System.out.println(board.subject + "\t" + board.contect+ "\t" +board.writer);
		}
		
	}

}
