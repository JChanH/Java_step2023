package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest04 {
	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("resource.txt", true); // 없으면 파일 만들어줌 저장
				FileInputStream fis = new FileInputStream("resource.txt")) {
			// 쓰기
			fos.write(65); //A 대응되는 문자로 저장
			fos.write(66); //B 대응되는 문자로 저장
			fos.write(67); //C 대응되는 문자로 저장
			//읽기
			System.out.println((char)fis.read() + " "); //Char로 출력
			System.out.println((char)fis.read() + " ");
			System.out.println((char)fis.read() + " ");
			System.out.println((char)fis.read() + " ");
			System.out.println((char)fis.read() + " ");
			
		}catch(Exception e) {
		}
d
	}

}
