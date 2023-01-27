package chapter21.InputStream;

public class SystemTest2 {

	
	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 enter를 누루세요");
		
		int i;
		try {
			while ((i = System.in.read()) != '\n'){ //엔터가 없을때 까지 읽는다
			System.out.println((char)i);
			System.out.println(i + " "); //아스키
			}
		} catch (Exception e) {
			
		}
		
		
	}
}

