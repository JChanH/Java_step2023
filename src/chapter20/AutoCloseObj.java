package chapter20;

public class AutoCloseObj implements AutoCloseable {

	// AutoCloseable : try- catch 문에서 선언된 객체들에 대해서 try가 종료되는 시점에서 자동으로 해체해주는 기능

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close()되었습니다.");
	}

}
