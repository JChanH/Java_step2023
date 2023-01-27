package chapter21.Others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
//입출력 클래스 중에서 유일하게 입츌력이 동이세 가능한 클래스
	// 포인터를 이용하여 동시에 입출력이 가능하다.
	// 다양한 자료형 메소드 제공
	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // rw : read, write이 가능함
		rf.writeInt(100);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer()); // 4
		rf.writeInt(100);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer()); // 4
		rf.writeDouble(3.14);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());// 4+8
		rf.writeUTF("안녕하세요");
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());// 4+8+17 => 포인터가 계속

		rf.seek(0);// 포인터의 위치를 다시 0으로 복귀시킨다.
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());

		
		//포인터가 움직이면서 읽어드림 
		int i = rf.readInt();
		int i2 = rf.readInt();
		double d = rf.readDouble();
		String s = rf.readUTF();

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println("파일 포인터의 위치 : " + rf.getFilePointer());

	}

}
