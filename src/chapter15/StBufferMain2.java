package chapter15;

public class StBufferMain2 {

	public static void main(String[] args) {

		String javaStr = new String("Java"); // 굳이 new로 만들어 주는 이유는 이어 붙이기 위해서
		// 처음 생성된 메모리의 주소
		System.out.println("javaStr의 처음 생성된 메모리 주소" + System.identityHashCode(javaStr)); // 405662939

		// singleton은 주소를 하나만 할당하여 사용함

		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println("연산 전 buffer 메모리 주소" + System.identityHashCode(buffer)); // 1227229563

		buffer.append(" and ");
		buffer.append("JSP ");
		buffer.append("programming is fun!!");
		System.out.println("연산 후 buffer 메모리 주소" + System.identityHashCode(buffer)); // 1227229563 (주소가 변경되지 않느 이유는
																					// StringBuffer는 한곳의 메모리만 참조하게 되어
																					// 있음)

		System.out.println(buffer);

		javaStr = buffer.toString(); // 변수방에 넣어주고 싶은 경우에는 toString으로 (없으면 type error)
		System.out.println("새로 만들어진 javaStr 메모리 주소 : " + System.identityHashCode(javaStr));
		System.out.println(javaStr);

	}

}
