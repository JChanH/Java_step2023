package chapter10;

public class Taxi extends Vehicle{
   
		public int taxiNum = 1005;

		@Override
		public void run() {
			System.out.println(taxiNum + "택시 가 달립니다.");
		}
		
		
		
}
