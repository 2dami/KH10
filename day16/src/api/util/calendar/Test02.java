package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//Calendar의 장점 - 시간설정
		// - 연도 설정이 Date보다 편하다.(월은 그대로 이다)
		// - 일자가 벗어나도 자동 계산된다.
		// - 윤년 등이 자동으로 계산된다.
		
		Calendar c = Calendar.getInstance();
		
		//설정
		//c.setYear(2020);
		//c.set(Calendar.YEAR, 2020); //연도를 2020으로 설정
		//c.set(2020,0,1); //[주의] 월은 1씩 차이남. (0~11로 관리되어 보정이 필요)
		int year = 2020, month = 1, date = 1;
		c.set(year,month -1, date);
		
		//출력
		Date d = c.getTime();
		Format f1 = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println(f1.format(d));
	}

}
