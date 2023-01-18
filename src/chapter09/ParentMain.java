package chapter09;

public class ParentMain {
	public static void main(String[] args) {

		ChildExam c1 = new ChildExam();

		System.out.println(c1.getCar()); // 벤츠
		System.out.println(c1.getMoney()); //ParentExam을 상속받았음으로 그곳에 있는 Heap영역의 데이터를 사용할수 있다
		System.out.println("----------------------------------------");
		// -----------------------------------------
		if (c1 instanceof ParentExam) { // instanceof ==> 상속 받아져 있는지 확인하는 명령어 (매게변수 instanceof 부모클라스)

			System.out.println("c1은 ParentExam의 자식 클래스 입니다.");
			System.out.println(c1.getMoney());  

		}
//===============================================================================
		//형변한 (객체들 간에)
		ChildExam ch = new ChildExam();
		ParentExam p1 = new ParentExam();
		System.out.println("---------------------");
		//부모 = 자식
		p1=ch; //자동형변환 p1=(ParentExam)ch;
		System.out.println(p1.getMoney());
		System.out.println(p1.getMoney());
		System.out.println("------------------------");
		ch=(ChildExam)p1; //명시적 형변환
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
		
		
		
		
		
		
		
		
		
		
	}
}
