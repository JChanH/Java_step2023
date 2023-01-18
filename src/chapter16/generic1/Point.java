package chapter16.generic1;

public class Point<T, V> {

	// 맴버변수
	T x;
	V y;

	public Point(T x, V y) {
		this.T = x;
		this.V = y;

	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

}
