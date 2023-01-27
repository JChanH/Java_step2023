package chapter21.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	
	public static void main(String[] args) throws IOException{
		//FileOutputStream fos = new FileOutputStream("output1.txt"); //파일을 만들어서 출력해준다
		FileOutputStream fos = new FileOutputStream("output2.txt", true); 
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65; //a
			
			for(int i = 0; i <bs.length; i++) {
				bs[i] = data;
				data++;
			}
			//fos.write(bs); //배열 한꺼번에 저장 => input1.txt 
			fos.write(bs, 2, 10); //특정 정보만 저장 가능함
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		System.out.println("저장이 완료되었습니다.");
		
	}
}
