package chapter19.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//BinaryOperator : FunctionalInterface로 되어 있어
class CompareString implements BinaryOperator<String> {

	@Override // 비교뷴속해서 하나로 묶어줌
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;

		} else {
			return s2;
		}
	}

}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = { "안녕하세요", "hellow", "Good Morning", "점심시간 입니다." };

		// BinaryOperator를 apply (byte를 비교하여 높은 값을 반환)
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str); //

		// 람다식
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

	}
}