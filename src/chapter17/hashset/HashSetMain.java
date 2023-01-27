package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		//equals와 hashcode가 overiding된 String Type //
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(new String("임정희"));
		hashset.add(new String("벅정희"));
		hashset.add(new String("홍현희"));
		hashset.add(new String("김강찬"));
		
		System.out.println(hashset); //HashSet은 순서없이 램덤으로 저장된다 
		hashset.add(new String("김강찬"));
		System.out.println(hashset); //같은 값을 추가하더라도 중복을 허용하지 않는다 
		
	}

}
