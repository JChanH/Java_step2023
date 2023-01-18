package chapter12;

public class CompleteCalc2 extends CompleteCalc1 {
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		/*
		 * try { return num1/num2; //일단 해보고
		 * 
		 * 
		 * }catch (Exception e) { return Calc.ERROR; //문제가 생기면 ERROR코드 뱉어줌
		 * 
		 * }
		 */
		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스");
	}

	@Override
	public void description() { //default 메소드 인데 재정의가 가능하다 
		// TODO Auto-generated method stub
		super.description();
	}
	
	
	
}
