package chapter21.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer2.txt", true)) {
			/*
			 * fw.write('A'); fw.write(65); fw.write("65");
			 */
			// 배열
			char[] buf = { 'b', 'c', 'd', 'E', 'F', 'G' };
			// fw.write(buf); //배열을 한꺼번에 저장 (writer.txt)
			fw.write(buf, 2, 4); // writer2.txt
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("파일생성 완료");
	}

}
