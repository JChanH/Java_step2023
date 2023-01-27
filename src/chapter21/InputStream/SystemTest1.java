package chapter21.InputStream;

public class SystemTest1 {

	
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 enter를 누루세요");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (Exception e) {
			
		}
		
		
	}
}

