package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3 {
	
	
	@Override
	public String jajang() {
		return "짜장";
	}

	@Override
	public String jjambong() {
		return "짬뽕";
	}

	@Override
	public String bokgumbab() {
		return "복금밥" ;
	}
	@Override
	public String tangsuyuck() {
		return "탕수육";
	}

	public static void main(String[] args) {

		InterMenuMain im = new InterMenuMain();
		
		
		//부모 = 자식
		Inter_Menu im1 = im; //업캐스킹
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		System.out.println("-------Inter_Menu-----------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambong());
		im1.show();
		System.out.println("-------Inter_Menu2-----------");
		System.out.println(im2.tangsuyuck());
		System.out.println("-------Inter_Menu3-----------");
		System.out.println(im3.bokgumbab());
		
	}

}
