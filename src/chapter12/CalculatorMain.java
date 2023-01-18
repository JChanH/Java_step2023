package chapter12;

public class CalculatorMain {
	public static void main(String[] args) {


		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc2();
		System.out.println( "---defualt method----");
		calc.description(); // 디폴트 추가
		System.out.println();
		
		System.out.println("---static Method---");
		int[] arr = {1,2,3,4,5};
		System.out.println("1부터 5까지의 합"+ Calc.total(arr)); //정적메서드 활용
		
		System.out.println("---interface method 호출 ---");
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substar(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		System.out.println("----child method---");
		CompleteCalc2 calc2 = new CompleteCalc2();
		calc2.showInfo(); //가져올수 있는 메소드가 없음 (개별로 매게변수로 클래스 끌고와서 구현)
		
		
		
		
		
	}
}
