package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//오늘 사귄 커플의 100일 기념일이 몇일인지 계산하여 출력
//(네이버 디데이 계산기 참고) 20221123
public class Test03_1 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		//계산
		Format f = new SimpleDateFormat("y년 M월 d일 E요일");
		c.add(Calendar.DATE, -1);
		for(int i =100; i<=1000; i+=100) {
		c.add(Calendar.DATE, 100);
		
		//출력
		Date d = c.getTime();
				System.out.println(i + "일 : " + f.format(d));
		
	}
	}
}


