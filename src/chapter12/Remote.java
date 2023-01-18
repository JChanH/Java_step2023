package chapter12;

public interface Remote { //인터페이스로는 정의만 해둠(abstract로 body없이) //뼈대

	//상수
	int MAX_VOLUME=10;
	int MIN_VOLUME =10;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	
}
