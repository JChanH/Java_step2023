package chapter22;

public class ThreadMulti_Main {

	public static void main(String[] args) {
		
		//멀티 쓰레드 
		ThreadEx03 t1 = new ThreadEx03();
		ThreadEx03_2 t2 = new ThreadEx03_2();
		//1과 2가 섞이면서 실행됨 (무작위로) // main 메소드의 자원을 사용중에 있는데 동기화 되어있는 상태가 아니여서 독립적으로 처리됨 (병행처리됨)
		t1.start();
		t2.start();
	
	}

}
