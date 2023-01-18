package chapter11;

public abstract class PlayLevel {
	public abstract void run(); //각 레벨에 따라 달리 실행됨

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();

		}
		turn();

	}
}
