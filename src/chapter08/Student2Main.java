package chapter08;

public class Student2Main {
	public static void main(String[] args) {

		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		studentLee.studentID = Student2.serialNum; // //Student2를 불러올때마다 serialNum을 누적시킨다 (생성된 객체 하나당 한번 가능함) 
		System.out.println("이름: " + studentLee.StudentName + " 아이디 :" + studentLee.studentID);

		//불러오면서 값을 누적시키는 것이 가능하다 (getSerial에 ++ 메서드를 넣는다 
		System.out.println(Student2.getSerialNum()); // static이기 때문에 바로 불러오는 것도 가능하다
		System.out.println(Student2.getSerialNum());
	}

}