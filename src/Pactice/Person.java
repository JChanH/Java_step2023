package Pactice;


	public class Person {
		// 한 사람의 정보 정의
		private String name;
		private int age;
		private String tel;
		
		public Person(String name, int age, String tel) {
			this.name = name;
			this.age = age;
			this.tel = tel;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}
	}

