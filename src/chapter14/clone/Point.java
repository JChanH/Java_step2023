package chapter14.clone;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { //hashcode가 아니라 해당 값을 던져주는것이 toString 
		return "x = " + x + " , y = " + y;


	
	
	}

}
