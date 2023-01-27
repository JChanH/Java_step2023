package chapter14.clone;

public class ArrayClonetest {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2;

		arr2 = arr1.clone(); // heap데이터 값을 복사한다 (동일하게 stack에 새로운 주소를 말들어 준다) (KEY + VALUE 복사)

		System.out.println("복사된 arr2 배열");
		for (int num : arr2) { //배열 arr2를 num으로 배열의 길이만큼 반복)
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("복사된 arr1 배열");
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		arr2[3] = 0; // 깊은 복사 (Deep Copy)
		System.out.println();
		System.out.println("변경 후 arr2 배열");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		//깊은 복사(Deep Copy) => '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미함 (실제 참고하고 있는 주소값은 다르다)
		//얕은 복사(Shallow Copy) => '주소 값'을 복사한다는 의미 (참조하고 있는 실제 값은 같음)  ==> 복사된 주소를 통해 실제값을 변경하면 동일하게 
		//original에서도 적용이 된다
		
	}

}
