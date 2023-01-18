package chapter14.hashcode;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override // 논리적 값 (데이터)
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj; // 부모 => 자식 downcasting 해주어야 함
			if (this.number == compareKey.number) {
				return true; // 값 일치
			}
		}
		return false;
	}



	@Override // 물리적 주소
	public int hashCode() {
		// return super.hashCode(); //원래 heap메모리 16진수 주소
		return number; //물리적 주소를 같게 해준다
	}

}
