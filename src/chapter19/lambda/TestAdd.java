package chapter19.lambda;

public class TestAdd {

	//Lambda : 메소드 이름이 없음 (구현부만 존재함 
	public static void main(String[] args) {
		//매개변수부터 시작함 
		Add addF =(x,y)->x+y; //Add라는 메소드에 구현부를 작석
		
		System.out.println(addF.add(3, 5)); //
		
	}
}
