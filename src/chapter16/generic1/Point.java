package chapter16.generic1;

public class Point<T, V> { //타입을 정해주는것이 간응함 

	// 맴버변수
	T x; //(타입이 T 변수가 x)
	V y;

	public Point(T x, V y) {
		this.x = x;
		this.y = y;

	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

}
