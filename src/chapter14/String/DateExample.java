package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); //지정된 날짜의 형태를 가지고 온다, long으로 출력 (현재 시간을 표시해 주는 메소드이며 long으로 저장되어 있다)

		// String으로 형변환해서 가져오는 경우에 toString을 사용 (toString을 사용가능한 이유는 heap에 
		String strNow = now.toString(); // 객체를 String 타입으로 변경함 (객체 heap => String의 타입으로 바꿈, 문자열로 변경함)
		System.out.println(strNow); //문자열로 출력

		
		//원하는 형태로 시간출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss"); //여기서 변경 가능함 (문자열 패턴으로 받는다)
		String strNow2 = sdf.format(now); // 문자열 패턴을 적용한 타입으로 출력함 (pattern 또한 String으로 구분됨)
		System.out.println(strNow2); //2023년 01월 17일 08시 15분 11
		System.out.println(sdf); //주소를 프린트
		//-----------------------------------------
		String strNow3 = sdf.toString(); //string 객체 반환
		System.out.println(strNow3);
		
		
		
	}
}
