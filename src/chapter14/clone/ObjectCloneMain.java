package chapter14.clone;

public class ObjectCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		//
		Circle circleCopyCircle = (Circle)circle.clone(); //복사 객체가 없을 가능성도 있어서 Exceptuion
		
		System.out.println(circle); //circle만 읽으면 전부 읽어들린다
		System.out.println(circleCopyCircle); 
		
		//hashcode
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopyCircle));
		System.out.println(circle.hashCode());
		System.out.println(circleCopyCircle.hashCode());
	}

}
