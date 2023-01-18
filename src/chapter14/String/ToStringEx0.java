package chapter14.String;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1 = new Object(); //java.lang에 저장되어 있는 최상의 클라스 
		Date obj2 = new Date();
		//재정의가 안되어 있는 기본 toString 
		System.out.println("object : " + obj1.toString()); // java.lang.Object@7637f22 ==> 여기에 저장된 최상의 클라스임을 알수 있다 
		System.out.println("Date.toString : " + obj2.toString());
		
		
		
		
		
	}

}
