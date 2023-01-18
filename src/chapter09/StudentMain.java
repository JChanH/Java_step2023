package chapter09;

public class StudentMain {
	
	public static void main(String[] args) {
		Student student = new Student("홍길동", "010=1=1=13=", 10000);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		System.out.println("studentNo : " + student.studentNo);
		
		
	}

}
