package chapter08;

public class CompanyMain {
	public static void main(String[] args) {
		// heap메모리 (일반적인 객체생성을 하고 있다)
		Company company1 = new Company();
		Company company2 = new Company();

		System.out.println(company1);
		System.out.println(company2);

		System.out.println("========SingleTon===============");
		// Data

		Company myCompany1 = Company.getInstance();
		System.out.println(myCompany1);

		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany2);

		System.out.println(myCompany1 == myCompany2);
	}
}
