package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {


	FileInputStream fis = null;
	
	//try-catch문을 사용해주어야 함
	try { //open전용
		fis=new FileInputStream("input.text");
	} catch (FileNotFoundException e) {
		System.out.println(e);
	}finally { //close 전용
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finally");
	}
	System.out.println("end");
	
	}
}
