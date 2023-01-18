package chapter14.String;

public class Student {

	int studentId;
	String studnetName;

	// 생성시
	public Student(int studentId, String studnetName) {
		this.studentId = studentId;
		this.studnetName = studnetName;
	}

	@Override
	public String toString() {
		return studentId + ", " + studnetName;
	}

	// 물리적 주소 (실제 장치의 어디에 저장되어 있는지 확인)
	@Override
	public int hashCode() { //주소를 어디로 할지 정할수 있음 
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj; // Downcasting 해주려고 instanceof 쓰임
			if (studentId == std.studentId) {
				return true;
			} else
				return false;
		}

		return false;
	}

}
