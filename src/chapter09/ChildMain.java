package chapter09;

public class ChildMain {
	public static void main(String[] args) {

		Child child = new Child();

		child.method1(); // 부모님꺼
		child.method2(); // 자식꺼 overriding된 상태 (stack은 저장된 메소드는 First in last out 이기 때문에 가장 최근에 수정된 것이 출력된다)
		child.method3(); // 자식꺼

		System.out.println();
		
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
		System.out.println();
		Parent Parent2=child; //Child를 불러왔던 메개변수를 넣어주어도 된다 (Child 가 Parent를 상속받은 상태임으로 가능하다)
		Parent2.method1();
		Parent2.method2();
		
	}

}
