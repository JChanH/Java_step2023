package chapter12.MultiInterface;

public interface Scheduler {

	//다음 고객의 콜 가져오기
	public void getNextCall();
	
	//상담원에게 콜 전달 
	public void sendCallToAgent();
	
	//스케줄링 방식
	//FCFS (First come First service) ==> 먼저 요청 들어온 것부터 실행
	//SSTF (Shortest seek time First) ==> 우선 완료된 것부터 실행
	
	
}
