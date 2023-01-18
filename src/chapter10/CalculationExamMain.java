package chapter10;

public class CalculationExamMain {

	public static double calc(CalculationExam c1, double a, double b) {
		return c1.getresult(a, b); //CalPlus와 Calminus에게 상속 + overriding 상태이기 때문에 
		//가능하다 

	}

	public static void main(String[] args) { // calc는 static으로 저장되어있어서 어디서나 사용 가능하다
		double x = 22.5;
		double y = 7.5;
		double plus = calc(new CalPlus(), x, y); // Calc c1 = new CalPlus();
		System.out.println(plus);
		System.out.println(calc(new CalMinus(), x, y)); //바로 뿌리는 것도 가능하다

		//다른 방법
		/*
	System.out.print("n1 > ");
		int n1 = scan.nextInt();
		System.out.print("n2 > ");
		int n2 = scan.nextInt();
		
		System.out.println("CalPlus : " + (new CalPlus()).getResult(n1, n2));
		System.out.println("CalMunus : " + (new CalMinus()).getResult(n1, n2));
	}
		*/
	}

}
