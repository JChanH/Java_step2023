package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest03 {
	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10]; // 버퍼로 활용
			int i;
			while ((i = fis.read(bs)) != -1) {
				/*
				 * //버퍼읽기 : 10개씩 가베지 값 출력 for(byte b :bs) { 
				 * System.out.print((char)b + " "); }//
				 * 자리가 남이있으면 기존에 남아있는 정보를 같이 프린트한다
				 */
				// 10개 출력
				for (int j = 0; j < i; j++) {
					System.out.print((char) bs[j] + " ");
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}
}
