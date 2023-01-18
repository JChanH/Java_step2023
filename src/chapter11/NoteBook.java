package chapter11;

public abstract class NoteBook extends Computer{
//상속받은 두개의 추상메서드중 하나라도 사용하지 않는경우 현 클래스도 추상(abstract)처리해준다
	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}



}
