package chapter11;

public class MainBoard {
	
	public static void main(String[] args) {
		
		//기본게임
		Player player = new Player(); //"초보자 입니다 출력"
		player.play(1); // BeginnerLevel의 메소드를 실행
	
		//레벨 2단계
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
	
		//레벨 3단계
		SuperLevel2 sLevel = new SuperLevel2();
		player.upgradeLevel(sLevel);
		player.play(3);
	
	
	}

}
