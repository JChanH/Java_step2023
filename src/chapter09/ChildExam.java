package chapter09;

public class ChildExam extends ParentExam { //ParentExam을 ChildExam이 상속받는다
	
	private String car = "벤츠";

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	

}
