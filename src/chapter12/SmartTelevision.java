package chapter12;

public class SmartTelevision implements Remote, Searchable {

	private int volume;
	
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 킨다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) { //상속받아서 사용 가능
			this.volume = Remote.MAX_VOLUME; //볼륨을 아무리 높여도 최대치로 고정힘
		}else if (volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME; // 
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv볼륨은 : " + this.volume  ); //저장해준다
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
		
	}

	
	
	
}
