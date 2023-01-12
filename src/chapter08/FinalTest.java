package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {
	//맴버변수
	//private int Max = 3; //heap에 저장됨
	//맴버변수를 전역변수로 만들어 주는것도 가능하다
	private static final int Max = 3; //static을 넣어주면서 전역변수로 
	//(final은 값을 고정해줌 ==> 상수값이 됨) 
	
	public static void main(String[] args) {
		// 지역변수
		int num=0;
		
		for(int i=0; i<Max; i++ ) {
			num = Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			
			if (num > Max) {
				System.out.println("입력값이 3보다 더 큽니다");
				
			}else {
				System.out.println("3보다 크지 않습니다.");
			}
				
			
			
			
		}
		
		
		
		
		
		
	}

}
