package chapter16.generic2;

public class GenericPrinter<T> { //타입을 T로 변경한다 (T는 좁은 범위의 object이다)
//<T extends Material> 상속받은것만 들어오도록 할수 있다 (Material에게 상속을 받은 타입만 가져오는게 가능하다
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

}
