package chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {

		Gen gen = new Gen();

		// 정수형
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		gen.printArr(iArr);

		// 더블형
		Double[] iArr2 = { 1.2, 2.3, 4.5 };
		gen.printArr(iArr2);

		// 문자형
		String[] iArr3 = { "김", "찬", "희" };
		gen.printArr(iArr3);

	}

}
