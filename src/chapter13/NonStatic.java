package chapter13;

import javax.swing.JOptionPane;

class out {

	// 필드
	static int a=1;
	// 생성자

	// 매서드

	// 내부 클래스
	public class In { // 클래스 안에 클래스가 들어가는 것이 가능하다
		// 필드

		// 디폴드 생성자

		// 메소드
		public String Infun() {
			return (a + "번째 Non-static 내부 실습");

		}

	}// inner class

}// outer class

public class NonStatic {
	public static void main(String[] args) {
		//1. 바깥 클래스 객체
		out obj1 = new out();
		obj1.new In(); // 외부 클래스를 통해서 In()내부의 클래스를 들어가겠다 (메모리를 따로 할당해 주어야 한다) 
		//2. 내무 클라스 객체 
		out.In obj2 = obj1.new In(); //굳이 out 클라스의 매게를 만들어 주고 in 클라스의 메모리를 할당해 주어야 함
		
		//3. 내부에 있는 메소드
		String str=obj2.Infun(); // In class 사용 가능함
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
		
		
		
	}
}
