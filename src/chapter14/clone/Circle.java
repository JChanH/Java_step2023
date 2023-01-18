package chapter14.clone;

public class Circle implements Cloneable { //객체 복사할때 사용함 
	
	Point point; //생성자를 통해서 다른 클래스의 객체를 만들어 주는것이 가능하다
	int radius;
	
	public Circle(int x, int y, int radius) { //생성자를 통해서 다른 클래스의 객체를 만들어 주는것이 가능하다
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override // 클래스으 객체 복사
	protected Object clone() throws CloneNotSupportedException { //복사할 매체가 없으면 Exception처리해준다 
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점은" + point + "이고,  반지름은 "  + radius;  
	}


	
	
	
	
	
}
