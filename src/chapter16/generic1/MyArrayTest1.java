package chapter16.generic1;

class MyArray {
	private Object[] array = new Object[10]; // 배열에 10개방 만들어줌
	int i;

	public void add(Object obj) { // 다양한 타입을 넣어주는것이 가능함(객체도 가능함)
		array[i++] = obj; // 불러줄때마다 다른 방에 저장해준다
	}

	public Object get(int index) {
		return array[index];
	}

}

public class MyArrayTest1 {

	public static void main(String[] args) {
		MyArray myArray2 = new MyArray();
		myArray2.add(new Integer(100));
		Integer num = (Integer) myArray2.get(0); // downcasting (get() ==> 몇번째 정보를 부를지

		System.out.println(num);

		// ------------------------------------------------------

		MyArray myArray1 = new MyArray();
		myArray1.add(new String("test"));
		String str = (String) myArray1.get(0); // downcasting

		System.out.println(str);

	}

}
