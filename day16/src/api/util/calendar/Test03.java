package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//오늘 사귄 커플의 100일 기념일이 몇일인지 계산하여 출력
//(네이버 디데이 계산기 참고) 20221123
public class Test03 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		//계산
		int date = c.get(Calendar.DATE);
		c.set(Calendar.DATE, date + 99);
		//c.add(Calendar.DATE, 99);
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("y년 M월 d일 E요일");
				System.out.println("100일 : " + f.format(d));
		
	}
		
	}


