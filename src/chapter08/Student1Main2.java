package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID = studentLee.serialNum;
		System.out.println("이름: " + studentLee.StudentName + " 아이디 :" + studentLee.studentID);

		System.out.println(Student1.getSerialNum()); // static이기 때문에 바로 불러오는 것도 가능하다
		Student1.serialNum++; // 10001로 변경됨

		Student1 studentKim = new Student1();
		studentLee.setStudentName("김창우");
		System.out.println(studentLee.StudentName);

		System.out.println(Student1.getSerialNum()); // static이기 때문에 바로 불러오는 것도 가능하다
		Student1.serialNum++; // 값을 누적시키는 것도 가능하다
	}

}
