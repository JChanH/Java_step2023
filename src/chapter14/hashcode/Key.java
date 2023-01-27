package chapter14.hashcode;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override // 논리적 값 (데이터)
	public boolean equals(Object obj) { // Key의 자식인지 확인하는 알고리즘
		if (obj instanceof Key) { // 객체값을 비교해준다
			Key compareKey = (Key) obj; // 부모 => 자식 downcasting 해주어야 함  (CompareKey에게 obj를 복사해준다)
			if (this.number == compareKey.number) { //다시 같은 number 값을 가지고 있는지 비교한다
				return true; // 값 일치
			}
		}
		return false;
	}

	@Override // 물리적 주소
	public int hashCode() {
		// return super.hashCode(); //원래 heap메모리 16진수 주소
		return number; // 물리적 주소를 같게 해준다
	}

}
