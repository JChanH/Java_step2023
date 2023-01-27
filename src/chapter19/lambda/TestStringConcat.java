package chapter19.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hellow";
		String s2 = "World";
		
		//인스턴스 변수 
		System.out.println("인스턴스 방식");
		StringConcatImple obj = new StringConcatImple();
		obj.makeString(s1, s2);
		
		//람다식
		System.out.println("람다식방식");
		StringConcat concat2 = (s,v) -> System.out.println(s + ", " + v);
		concat2.makeString(s1, s2);
		
		//익명의 내부 클래스 방식
		System.out.println("익명의 내부 클래스 방식");
		StringConcat concat3 = new StringConcat()
		
		
		
	}

}
