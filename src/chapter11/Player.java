package chapter11;

public class Player {

	private PlayLevel level; // 매게변수 지정만 하고

	public Player() {
		level = new BeginnerLevel(); // 필요한때 가져다 씀 (우선 비기너 레벨부터 시작)
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); //PlayLevel에 돌아가서 go를 실행

	}

	public void upgradeLevel(PlayLevel level) { //PlayLevel에 상속된 자식 클라스 사용
		this.level = level;
		level.showLevelMessage();

	}

	public PlayLevel getLevel() {
		return level;
	}

}
