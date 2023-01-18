package chapter09;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;

	}

	void turnOnDmb() {
		System.out.println("채널 :" + channel + "번 Dmb 방송 수신을 시작합니다");

	}

	void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 :" + channel + "번으로 바꿉니다");

	}

	void turnOffDmb() {
		System.out.println("방송수신을 멈춥니다");

	}

}
