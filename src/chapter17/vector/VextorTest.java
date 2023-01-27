package chapter17.vector;

import java.util.Vector;

public class VextorTest {

	public static void main(String[] args) {
		
		Object obj;
		//크기1의 배열 선언
		Vector<Object> vec = new Vector<Object>(1); //용량을 1만큼 준다
		
		obj = 20221327;
		vec.addElement(obj); //addElement => 추가
		System.out.println("용량은 #1 :" + vec.capacity()); //용량은 1
		//vector에 저장되어 있는 수 
		System.out.println("크기는 #1:" + vec.size()); //size도 1
		
		
		obj = "some people";
		vec.addElement(obj); //addElement => 추가
		System.out.println("용량은 #2 :" + vec.capacity()); 
		//vector에 저장되어 있는 수 
		System.out.println("크기는 #2 :" + vec.size());
		
		
		obj = "dream of success";
		vec.addElement(obj); //addElement => 추가
		System.out.println("용량은 #3 :" + vec.capacity()); 
		//vector에 저장되어 있는 수 
		System.out.println("크기는 #3 :" + vec.size());
		
		
		obj = "while";
		vec.addElement(obj); //addElement => 추가
		System.out.println("용량은 #4 :" + vec.capacity()); 
		//vector에 저장되어 있는 수 
		System.out.println("크기는 #4 :" + vec.size());
		
		obj = "while";
		vec.addElement(obj); //addElement => 추가
		System.out.println("용량은 #4 :" + vec.capacity()); //용량이 초과되면 기전의 용량에서 2배로 늘어난다 (자동으로 용량 확장) (size가 capacity를 와 같아지면 
		//vector에 저장되어 있는 수 
		System.out.println("크기는 #4 :" + vec.size()); //저장되어 있는 Element의 수
		
		System.out.println(vec);
		
	}

}
