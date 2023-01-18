package chapter11;

public class SuperLevel2 extends PlayLevel{

	@Override
	public void run() {
		System.out.println("아주 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("더 높이 점프를 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한바뀌돈다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("슈퍼 레벨입니다");
	}

	
	
	
	
}
