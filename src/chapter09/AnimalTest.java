package chapter09;

public class Animal { //클라스는 개별로 존재한다
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
	class Human extends Animal { //Animal을 상속받았음 
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
			System.out.println("호랑이가 사냥합니다 읽습니다.");
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


public class AnimalTest {


	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();

		//Animal animal = new Human(); //현재 Animal이 상속하고 있는 상태임으로 가능함
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new tiger());
		aTest.moveAnimal(new eagle());

	}

	public void moveAnimal(Animal animal) { //class Animal에 있는것을 가지고 오려고 매게변수 animal을 사용하는데 

		animal.move();
	}

}
