package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		// ---------------------------------------------
		GenericPrinter<Plastic> printPlastic2 = new GenericPrinter<Plastic>(); //어떤 타입의 자료를 사용하는지 명시
		//Plastic p5 = new Plastic();
		//printPlastic2.setMaterial(p5);
		printPlastic2.setMaterial(new Plastic());
		Plastic plastic = printPlastic2.getMaterial();
		System.out.println(plastic);
		plastic.doprinting();
		//-------------------------------------------------------------------
		//물의 재료는 혀용되면 안되지만 제너릭의 특성상 허용되는 모순이 발생한다
		GenericPrinter<Water> printWater = new GenericPrinter<Water>();
		printWater.setMaterial(new Water());
		System.out.println(printWater);
		
		
		
		
		
	}

}
