package chapter09;


//상속 (precompile)
public class Berry extends Fruit{ //Fruit에 저장된 맴버변수를 상속받는다 (Fruit가 부모, Berry가 자식)

	private String name;
	private String size;
	
	
	//setter
	public void Set2(String a, String b) {
		name=a;
		size = b;
		
		
		
	}
	
	
	//getter
	public void Disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크지 : " + size);
		
		
	}
	
	
	
	
}
