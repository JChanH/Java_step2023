package chapter16.generic1;

class MyArrayG<E> { // generic 코드를 넣어주면<E> 형변환을 해주지 않아도 된다
	private Object[] array = new Object[10];
	int i;

	public void add(Object obj) { // 객체가 들어가야함
		array[i++] = obj;

	}

	public E get(int index) {
		return (E) array[index];

	}

}

public class MyArrayTest2 {

	public static void main(String[] args) { //
		MyArrayG<Integer> myArray2 = new MyArrayG<>(); // 형변환이 되어서 나온다
		myArray2.add(new Integer(100));
		Integer num = myArray2.get(0); // 굳이 형변환을 하지 않고 사용가능 (autoboxing)
		System.out.println(num);
		

		//원하는 타입을 넣어주는것이 가능하다
		MyArrayG<String> myArray1 = new MyArrayG<>();
		myArray1.add(new String("test"));
		String str = myArray1.get(0); // 
		System.out.println(str);


	}

}
