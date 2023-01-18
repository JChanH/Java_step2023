package chapter15;

public class StBufferMain {

	public static void main(String[] args) {

		// StringBuffer 클래스에 있는
		StringBuffer buf = new StringBuffer(" nice day");
		System.out.println(buf.toString()); // toString은 메개변수의 value값을 출력해준다 (본래는 주소가 나온다)
		System.out.println(buf.length());

		// StringBuffer의 기본 용량은 16byte = 추가 (8) = 24byte
		System.out.println(buf.capacity());

		// 25를 넘어가면 허용범위가 (25~50)까지는 갖고 있는 (용량*2) +2 =50
		buf.ensureCapacity(51);
		System.out.println(buf.capacity());

		// 원하는 자리에 넣는것도 가능하다 (자리 , 문자열)
		buf.insert(0, "hi!");
		System.out.println(buf);
		System.out.println("-----------------------");
		buf.insert(12, " everybody");
		System.out.println(buf);
		System.out.println("-----------------------");
		buf.delete(0, 4); //자리의 숫자를 삭제하는 것도 가능하다 
		System.out.println(buf);

	}

}
