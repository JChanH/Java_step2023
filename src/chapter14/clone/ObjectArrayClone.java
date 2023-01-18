package chapter14.clone;

import java.util.ArrayList; //리스트를 사용하기 위한 import

class MyBook implements Cloneable {
	String title;

	public MyBook(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() { // 객체를 읽으면 title이 반환됨

		return title;
	}

}

public class ObjectArrayClone {

	public static void main(String[] args) {
		//MyBook클라스에 ArrayList를 만들어 준다
		ArrayList<MyBook> bookList = new ArrayList<MyBook>(); // array라는 칸에 객체를 넣어주는 것 (type은 MyBook)
		MyBook book1 =new MyBook("자바"); //객체는 아무것도 없으면 null을 넣어준다
		MyBook book2 =new MyBook("스프링"); //MyBook이라는 공간에 book 공간을 할당해서 자료를 넣는다
		MyBook book3 =new MyBook("파이썬"); 
		//bookList에 객체 넣어줌
		bookList.add(book1); //저장된 title값을 넣어준다
		bookList.add(book2);
		bookList.add(book3);
		
		
		ArrayList<MyBook> copyList = (ArrayList)bookList.clone();
		
		
		/*
		MyBook copybook = new Mybook("c++")
		copyList.add(copybook);
		*/
		
		
		copyList.add(new MyBook("Oracle"));
		System.out.println(bookList);
		System.out.println(copyList);
		
		
		book3.setTitle("c++"); //깊은 복사 (자료가 변경됨)
		System.out.println(bookList);
		System.out.println(copyList);
		
		
		
		
	}

}
