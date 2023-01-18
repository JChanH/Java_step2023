package chapter11;

public abstract class Phone {

	public String owner;
	//상속시 부모의 생성자를 사용해야함
	public Phone(String owner) {
		this.owner=owner;
	}
	public void turnOn() {
		
		System.out.println("전원을 킵니다");
	}
	
	public void turnoff() {
		System.out.println("끕니다.");
	}
	
	
	
	
	
		
}
