package chapter11;

public class AdvancedLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프를 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn은 불가능 합니다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("숙련자 레벨입니다");
	}

	
	
	
	
}
