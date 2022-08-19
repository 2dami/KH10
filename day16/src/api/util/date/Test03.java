package api.util.date;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

//시간출력
//2022년 8월 16일 화
//오후 12시 2분
//12:02:35
//2022-08-16 화 12:02:35
public class Test03 {
	public static void main(String[] args) {
		
		Date d = new Date();
		
		//2022년 8월 16일 화
	//SimpleDateFormat f = new SimpleDateFormat("y년 M월 d일 E");
		Format f = new SimpleDateFormat("y년 M월 d일 E");// up-casting
			System.out.println(f.format(d));

			//오후 12시 2분
			Format f2 = new SimpleDateFormat("a h시 m분");
	System.out.println(f2.format(d));
	
	//12:02:35
	Format f3 = new SimpleDateFormat("HH:mm:ss");
	System.out.println(f3.format(d));
	
	//2022-08-16 화 12:02:35
	Format f4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
	System.out.println(f4.format(d));

}
}
