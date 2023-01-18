package chapter16.generic1;

public class Gen<T> {

	public <T> void printArr(T[] arr) { //배열 타입을 넣어준다
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

	}

}
