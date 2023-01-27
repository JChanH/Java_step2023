package chapter21.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		// 파일을 만들고 데이터를 넣어줌
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeByte(100); // 타입을 인지하고 들어감
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("it's good"); // String 타입

		} catch (Exception e) {
			e.printStackTrace();
		}
//데이터 출력
		try (FileInputStream fis = new FileInputStream("data.txt"); DataInputStream dis = new DataInputStream(fis)) {
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

//DataInputStream , DataOutputStream: 자바의 기본 자료형 타입의 정보를 입력하고 출력하는데 사용