package chapter21.Others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		//입출력 가능은 없음
		//파일의 속성, 경로, 이름들의 정보를 제공하는 메소드
		File file = new File("read.txt"); //해당 경로에 File 클래스 생성. 아직 실제 파일이 생성된 것은 아님 
		file.createNewFile(); //실제파일 생성
		
		System.out.println(file.isFile()); //파일인지 확인
		System.out.println(file.isDirectory()); 
		System.out.println(file.getName()); 
		System.out.println(file.getAbsolutePath()); 
		System.out.println(file.getPath()); 
		System.out.println(file.canRead()); 
		System.out.println(file.canWrite()); 
		
		
		
		
	}

}
