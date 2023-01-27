package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Shape {
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Circle");
	}

	void circle() {
		System.out.println("원모양 입니다.");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}

	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("draw triangle");
	}

	void triangle() {
		System.out.println("삼각형모양 입니다.");
	}
}

public class ShapeTest {
	// Shape에게 상속받은 다른 클라스들을 사용 가능함 (shape 포함)
	ArrayList<Shape> sList = new ArrayList<>();

	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("----업캐스팅-----"); // 자식 클라스의 객체가 부모 클래스타입으로 변환
		sTest.addShape(); // shape sc = new Circle
		sTest.testCasting();
	}

	public void addShape() { // 클래스들이 들어가는 자리
		sList.add(new Circle()); // 0
		sList.add(new Triangle());// 1
		sList.add(new Rectangle());// 2

		for (Shape s : sList) {
			s.draw();
		}
	}

	public void testCasting() {

		for (int i = 0; i < sList.size(); i++) {
			Shape s = sList.get(i); // 일단 부모(shape) 타입으로 가져옴
			if (s instanceof Circle) { // 상속받은게 맞는지 확인
				Circle c = (Circle) s; // 다운캐스팅
				c.circle();
			
			}else if (s instanceof Rectangle) { // 상속받은게 맞는지 확인
				Rectangle r = (Rectangle) s; // 다운캐스팅
				r.rectangle();
			
			}else if (s instanceof Triangle) { // 상속받은게 맞는지 확인
				Triangle t = (Triangle) s; // 다운캐스팅
				t.triangle();

			}

		}
	}
}