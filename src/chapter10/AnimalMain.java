package chapter10;

public class AnimalMain {
	public static void main(String[] args) {
		AnimalMain main = new AnimalMain();
		main.method(new Bear());
		main.method(new Lion());
		main.method(new Spider());
		
		
	}
	
	public void method (Animal animal) {
		animal.set();
		
		
	}
	
	
	
}
