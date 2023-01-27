package chapter21.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	// 버전 관리를 위한 정보
	// 직렬화로 처리하는 경어 Serializable 사용
	private static final long serialVersionUID = 1L;
	String name;
	String job;
	// transient : 직렬화 하지 않겠다 (byte로 변환하지 않겠다)
	transient String number;

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + " , " + job;
	}

}

public class SerializationTest {

	public static void main(String[] args) {

		Person personAhn = new Person("홍길동", "대표이사");
		Person personKim = new Person("김연아", "상무이사");

		// objectOutputStream : 파일이나 네트워크로 데이터를 전달하기 위해 지렬화를 수행해줌
		// writeObject() : 직렬화 메소드
		// --------------------------직열화-------------------------------
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(personAhn); // 직렬화 되어서 객체가 들어감
			oos.writeObject(personKim);

		} catch (Exception e) {
			// TODO: handle exception
		}
		// ObjectInputStream : 파일이나 네트워크를 통해 전달 받은 직렬화한 데이터를 다시 원래대로 돌리는 역할
		// ------------------------역직렬화-------------------------
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			//다시 객체 상태로 저장 
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();

			//출력
			System.out.println(p1);
			System.out.println(p2);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
