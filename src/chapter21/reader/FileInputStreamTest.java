package chapter21.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		try (FileReader fis = new FileReader("reader.txt")) { //FileInputStream은 바이트 단위로 일겅오니 무슨 글자인지 읽지 못함
			//FileReader로 읽어주는게 가능(문자열을 처리는 FileReader)

			int i;
			while ((i = fis.read()) != -1) {
				
				System.out.print((char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}