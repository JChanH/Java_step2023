package chapter15;

public class StringTest1 {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		String android = new String(" androidStr");
		System.out.println(javaStr); // 본래 hashcode값이 나와야 하는데 value값이 나온다 (내부에 toString 메소드가 있음)
		System.out.println(javaStr.hashCode()); // 본래 hashcode값이 나와야 하는데 value값이 나온다 (내부에 toString 메소드가 있음) //10진수로 표현
		System.out.println(System.identityHashCode(javaStr)); // 16진수로 표현됨

		javaStr = javaStr.concat(android);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); // 돞어쓰면 hashcode도 변경됨

	}

}
