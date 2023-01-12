package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
		
		Bank bk1 = new Bank("강남", "010-1111-2222");
		bk1.interest = 0.2f;
		Bank.interest = 0.2f;
		bk1.getbank();
		
		System.out.println("--------------------------");
		
		Bank bk2 = new Bank("일산", "010-3333-2257");
		bk2.getbank(); //interest는 초기화가 되어있기 때문에 값이 고정되어 있음
		
		//방법2
		String point = null;
		String tel = null;
		Scanner sc = new Scanner (System.in);
		
		point = JOptionPane.showInputDialog("지점명");
		tel = JOptionPane.showInputDialog("전화번호");
		Bank bank = new Bank (point, tel);
		
		System.out.println(point + "지점의 이자를 입력하세요");
		Bank.interest = sc.nextFloat(); //static이라 바로 입력해줄수 있다 
		
		bank.getbank();
		
		
	}
}
