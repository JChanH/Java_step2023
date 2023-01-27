package chapter21.InputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) throws IOException {

		FileReader fis = null;
		try {
			int i;
			fis = new FileReader("input.txt");
			// fis.read() : 파일을 끝까지 읽으면 -1을 반환해줌
			while ((i = fis.read()) != -1) {
				System.out.println((char) i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				//NullPointerException를 잡지 못해서 죽음 
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}

		}
		System.out.println("end");

	}
}
