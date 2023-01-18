package chapter09;

public class InheritanceMain {

	
	public static void main(String[] args) {
		StrawBerry  obj = new StrawBerry();
		//StrawBerry만 가지고 오면 3개의 클라스를 전부 사용 가능  (Fruit + Berry + StrawBerry)
		
		obj.Set1("Berry", "여름");
		obj.Set2("딸리", "춤");
		obj.Set3("빨강", 7000);
		obj.Disp1();
		System.out.println("=================================");
		obj.Disp2();
		System.out.println("=================================");
		obj.Disp3();
		System.out.println("=================================");
		
		
	}
}
