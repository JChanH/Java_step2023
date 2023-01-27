package chapter21.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {

	String name;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name); // 직렬화 하는 경우에 UTF로 변환하겠다
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF(); // 역직렬화 하는 경우에도 UTF로 변환하여 보여주겠다
	}

	@Override
	public String toString() {
		return name;
	}

}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		// Externalizable : 인터페이스 Exteranlizable을 사용하여 내부의 내용을 쉽게 조작(직렬화, 역직렬화가 가능함)
		// writeExternal / readExternal()
		Dog myDog = new Dog();
		myDog.name = "최백설";

		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 짧게 fos; oos로 사용해도 무관함
		try (fos; oos) {
			oos.writeObject(myDog);

		} catch (Exception e) {
			e.printStackTrace();
		}

		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 짧게 fos; oos로 사용해도 무관함
		try (fis; ois) {
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
