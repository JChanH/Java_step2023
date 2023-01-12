package chapter08;

public class Guest {

	// 필드
	private String name; //이름
	private String gender; //성별 

	public String getpoint() {
		return Guide.point;// guide에 포인트를 가져온다

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
