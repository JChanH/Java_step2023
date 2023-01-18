package chapter13;

class Out2 {
	static int a = 1;
	int b;

	public static class In {
		String Infun() {
			return (a + "번째 static 내부 클래스");
		}
	}

}

public class EmbedMain {

	public static void main(String[] args) {
		//static은 클래스 명으로 직접 접근이 가능함
		Out2.In x = new Out2.In(); //굳이 out2의 매개변수를 받아서 메모리를 확보할 필요는 없음
		System.out.println(x.Infun());
		
	}
}
