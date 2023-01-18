package chapter09;

public class SuperMain {

	public static void main(String[] args) {
		Paprika obj = new Paprika();
		Vegetable obj2 = new Vegetable();
		
		obj.Set1("피망류", "여름", "노랑파프리카"); //부모클래스의 생성자 사용
		obj.Set2("빨강", 7000, "빨강파프리카");
		
		
		obj.Disp1();
		obj.Disp2();
		System.out.println(obj);
		System.out.println(obj2);
		
	}

}
