package chapter15;

public class PersinMain {

	public static void main(String[] args) throws ClassNotFoundException { //예외처리 던져주기
		
		//방법1
		Person person = new Person();
		Class pClass = person.getClass(); //getClass = 클래스의 정보를 가져옴
		
		System.out.println(pClass.getName()); //클래스의 정보를 가지고 옴 (chapter15.Person)
		
		//방법2
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); //클래스의 정보를 가지고 옴 (chapter15.Person)
		
		//방법3 forName => 클래스의 정보를 얻어오는 클래스 ()에 파일명을 인자로 넣어주면 해당하는 클래스를 반환해줍니다
		Class pClass3 = Class.forName("chapter15.Person"); //클래스가 없는경우에는 예외처리 해준다
		System.out.println(pClass3.getName()); //클래스의 정보를 가지고 옴 (chapter15.Person)
		
		
		
	}

}
