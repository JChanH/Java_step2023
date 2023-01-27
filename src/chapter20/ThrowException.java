package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	}
	
	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		try { //파일이 없을 가능성도 있으니 try-catch문을 사용한다
			test.loadClass("b.txt", "java.lang.String");
			//하나 걸려도 두번째 것도 검사한다
		} catch (FileNotFoundException | ClassNotFoundException e ) {//논리연산자 사용 가능함
			e.printStackTrace();
		} catch(Exception e) {//위에서 오류를 잡아내지 못했을 경우에는 최상위 클래스 Exception을 실행
			System.out.println(e);
		}
	System.out.println("end");
	
	}

}
