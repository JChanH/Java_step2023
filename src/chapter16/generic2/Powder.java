package chapter16.generic2;

public class Powder extends Material {

	public void doprinting() {
		System.out.println("Powder을 출력합니다.");
	}

	@Override
	public String toString() {
		
		return "재료는 Powder입니다";
	}
	

}
