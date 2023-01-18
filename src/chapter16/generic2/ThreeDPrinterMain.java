package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		// 방법 1
		ThreeDPrinter printerPowder = new ThreeDPrinter();
		Powder p1 = new Powder();
		//printerPowder.setMaterial(p1); // Powder의 메게변수를 넣어준다
		System.out.println(p1); //toString으로 주소가 아닌 value값을 준다
		// 방법2
		System.out.println("---------------------------");
		Powder p2 = (Powder) printerPowder.getMaterial();
		System.out.println(p2);

		// ---------------------------------------------
		ThreeDPrinter printPlastic = new ThreeDPrinter();
		Plastic p3 = new Plastic();
		printPlastic.setMaterial(p3);
		System.out.println(p3);

		Plastic p4 = (Plastic) printPlastic.getMaterial();
		System.out.println(p4);

	}

}
