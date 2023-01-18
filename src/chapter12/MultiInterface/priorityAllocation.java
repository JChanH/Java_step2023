package chapter12.MultiInterface;

public class priorityAllocation implements Scheduler{
	
	//메모리에 우선건을 주어서 우선 수행되게 한다(자주쓰는 것들)

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 순서대로 대기열에서 가져옵니다.");
			
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill값이 가장 높은 상담원에게 우선적으로 배분하기");
		
	}

}
