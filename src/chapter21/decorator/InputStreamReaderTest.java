package chapter21.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// FileInputStream : 파일을 저장되어 있는 것만 읽음
		// 실시간으로 byte로 변환하여 뿌려주는 것이 가능하는 경우
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			// System.in은 byte단위로 처리가 가능
			// InputStreamReader isr2 = new InputStreamReader(System.in)

			int i;
			while ((i = isr.read()) != -1) {
				System.out.println((char)i);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		//Socket의 예
		Socket socket = new Socket();
		try {
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
			//한줄씩 읽어들이기 (소켓으로 잡아서 데이터 읽어드림)
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine(); //파일로 처리해주지 않고 한줄씩 읽어서 들여온다
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
