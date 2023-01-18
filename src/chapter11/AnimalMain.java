package chapter11;

public class AnimalMain {
	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------------");
	
		Animal animal= null; // 객체는 null
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound (Animal animal) { //부모클라스를 호출하여 넣어준다
		animal.sound(); //메서드를 중복하여 사용 가능
	}
}
