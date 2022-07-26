package data;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
	//1시간40분 + 2시간30분 = ?
	
	//준비
	int hour1 = 1;
	int minute1 = 40;
	int hour2 = 2;
	int minute2 = 30;
	
	//계산
	int time1 = 60 * hour1 + minute1;
	//System.out.println(time1);
	int time2 = 60 * hour2 + minute2;
	//System.out.println(time2);
	
	int time = time1 + time2;
	//System.out.println(time);
	int hour = (time1 + time2) / 60;
	//System.out.println(hour);
	int minute = (time1 + time2) % 60;
	//System.out.println(minute);
	
	//출력
	System.out.println(4);
	System.out.println(10);
	
	}
}
