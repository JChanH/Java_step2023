package chapter20;

public class ArrayExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[5];
		/*
		for(int i=0 ; i <= 5; i++) {
			System.out.println(arr[i]); //Index 5 out of bounds for length 5
		}
		*/
		
		try {
			for(int i=0 ; i <5; i++) {
				arr[i] = i+1;
				System.out.println(arr[i]); }
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally { //에러가 나지 않던 무저곤 수행 (에러가 없어도 수행한다)
			System.out.println("Finally");
		}
		
	}

}
