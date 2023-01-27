package chapter21.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {

	public static void main(String[] args) throws IOException {
		// FileOutputStream fos = new FileOutputStream("output1.txt"); //파일을 만들어서 출력해준다
		FileOutputStream fos = null;
		fos = new FileOutputStream("output3.txt", true);

		fos.write(71);
		fos.write(72);
		fos.write(73);

		fos.flush(); // 출력버퍼 비우기
		fos.close();
		System.out.println("파일이 생성되었습니다.");
	}
}