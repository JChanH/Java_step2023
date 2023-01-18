package chapter14.String;

import java.util.Date;

class Book {
	// heap의 StringPool에 자리만 할당한 상태
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// String의 문자열로 출력해주는 toString재정의 (이미 java.lang에 저장되어 있음)
	@Override
	public String toString() { //return값을 문자열로 변경해준다
		return title + ", " + author;
	}

}

public class ToStringEx01 {
	
	public static void main(String[] args) {

		Book book = new Book("자바", "홍길동");
		// 객체는 heap매모리를 사용 ->heap메모리는 16진수 주소값을 가지고 있음
		System.out.println(book); // toString 데이터를 출력해줌
		System.out.println(book.toString()); // toString 메소드를 직접 호출해도 무관함

		String str = new String("test"); // String이
		System.out.println(str);

	}

}
