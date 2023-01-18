package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰", "검정", 10);

		// cellPhone으로부터 상속받은 필드를 뿌려보기
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hi");
		dmbCellPhone.receiveVoice("bye");
		dmbCellPhone.hangup();

		// DmvCellphone의 필드
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.ChangeChannelDmb(30);
		dmbCellPhone.turnOffDmb();
		
		// CellPhone의 메소드를 사용하여 전화통화 구현
		dmbCellPhone.sendVoice("안녕");
		dmbCellPhone.receiveVoice("그래");
		dmbCellPhone.sendVoice("잘가");
		dmbCellPhone.receiveVoice("그래");
		dmbCellPhone.sendVoice("빨리가");
		dmbCellPhone.receiveVoice("그래");

		// DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		dmbCellPhone.ChangeChannelDmb(50);
	}
}
