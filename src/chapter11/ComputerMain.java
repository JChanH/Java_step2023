package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//Computer c1 = new Computer();
		//추상 클래스는 메서드를 만들수 없다
		Computer c2 = new DeskTop();
		Computer c4 = new MyNoteBook();
		c2.typing(); //DeskTop
		c2.display(); //DeskTop
		
		c4.display(); //NoteBook
		c4.typing();//MyNoteBook
		
		
		
	}

}
