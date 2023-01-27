package chapter17.arraylist_stack_queue;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // Animal을 상속받았음
	public void move() {
		System.out.println("사람이 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥합니다.");
	}
}

class eagle extends Animal {
	public void move() {
		System.out.println("독수리가 걷습니다.");
	}

	public void flying() {
		System.out.println("독수리가 난다");
	}
}

//------------------------------------------------------------------------------
public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();

	// ------------------------------------------------------------------------------
	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		System.out.println("업캐스팅");
		aTest.addAnimal();
		System.out.println("---------------------------");
		aTest.testCasting();
	}

	// --------------------------------------------------------------------------------
	public void addAnimal() { //매개변수 없이 클라스를 ArrayList에 넣어준다
		aniList.add(new Human());
		aniList.add(new tiger());
		aniList.add(new eagle());

		for (Animal s : aniList) {
			s.move(); //오버라이딩된 상태임으로 각 클래스에 오보라이딩된 move를 사용가능하다 
		}

	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal a = aniList.get(i); //Animal a = new Human(); //상속관계
			if (a instanceof Human) {// Human이 Animal에게 상속받았는지 확인 (
				Human H = (Human) a; // 다운 캐스팅 (부모가 자식것을 사용하기 위해서)
				H.readBook(); //
			} else if (a instanceof tiger) {
				tiger t = (tiger) a;
				t.hunting();

			} else if (a instanceof eagle) {
				eagle e = (eagle) a;
				e.flying();
			}

		}

	}

}
