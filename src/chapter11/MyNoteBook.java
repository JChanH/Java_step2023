package chapter11;

public class MyNoteBook extends NoteBook { //Computer에서 선언되지 않은 메소드들을 Override하여 사용해야 한다

	//추상 클래스의 NoteBook을 받으면 

	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing");
	}

	
	
	
}
