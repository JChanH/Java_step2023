package chapter12.MultiInterface;

public class LeastJob implements Scheduler{
//수행 없는가 없는 곳에 배분
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순소대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담대가 시간이 가장 작은 상담원에게 배분합ㄴ디ㅏ.");
		
	}

}
