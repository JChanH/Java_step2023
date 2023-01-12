package chapter08;

public class Student2 {
	public static int serialNum = 9999;

	int studentID;
	String StudentName;
	int grade;
	String address;

	public Student2() { //Student2를 불러올때마다 serialNum을 누적시킨다
		studentID =  ++serialNum;
		
	}
	
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public static int getSerialNum() {//getSerialNum를 불러올때마다 serialNum을 누적시킨다
		serialNum++;
		return serialNum;
	}

}
