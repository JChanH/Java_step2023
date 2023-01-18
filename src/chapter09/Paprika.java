package chapter09;

public class Paprika extends Vegetable {

	private String color;
	private int price;
	private String name;// 변수이름이 Vegetable과 겹친다

	// 기본생성자
public Paprika() {
	// TODO Auto-generated constructor stub
}
	// setter
	public void Set2(String a, int b, String c) {
		color = a;
		price = b;
		name = c;

	}

	public void Disp1() {
		// TODO Auto-generated method stub
		System.out.println("---------paprika------------");
		System.out.println("분류 : " + sort); // sort가 없어도 상속받아서 사용 가능
		System.out.println("계절 : " + season);
		// 맴버변수가 부모로 부터 상속받은 것과 일치하는 것이 있는 경우
		System.out.println("이름 : " + super.name); // super를 붙여주면 부모클래스의 Vegetable의 name을 가져옴
		// super() ==> Java.lang의 내장형 메소드를 사용하는 경우

	}

	public void Disp2() {
		System.out.println("---------paprika------------");
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("이름 : " + name);
	}

}