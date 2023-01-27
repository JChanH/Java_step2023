package chapter19.lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		// 인스턴스 변수방에 구현부를 저장
		MyNumber max = (x, y) -> (x >= y) ? x : y; // 둘을 비교해서 큰숫자를 읽는다

		System.out.println(max.getMax(10, 20));

	
	}

}
