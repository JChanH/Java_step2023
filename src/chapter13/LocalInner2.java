package chapter13;

class Outter {
	// 외부 클래스 맴버 변수
	int outNum = 100;
	static int sNum = 200;

	// Runnable 매게변수와 맴버변수는 "final"로 정의된다
	Runnable getRunnable(int i) {// 익명의 클래스 (Runnable은 Data영역에 저장된다)
		//return null; // Runnable은 return하여야 함 //바로 메서드로 치고 들어감
		int num = 100; //final

		class MyRunnable implements Runnable { //어쩌피 
			int localNum = 10; //내부 클래스의 맴버변수
			
			@Override
			public void run() {
				//num =200; num이 이미 위에서 상수값으로 정의되어서 재정의 불가능함
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println(" outter.sNum = " + Outter.sNum); //외부 데이터 영역 (Static이기 때문에 끌어다가 사용 가능함
			}//run

		}//Runnable
		return new MyRunnable(); // MyRunnable를 리턴 

	}

}

public class LocalInner2 {

	public static void main(String[] args) {
		Outter out = new Outter(); 
		Runnable runner = out.getRunnable(10); // 바로 Outer에서 Runnable의 함수 run으로 접근 안됨 (Runnable 경유해서 들어가야함)
		runner.run();
		
		
		

	}

}
