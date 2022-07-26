package data;
//KH주차장 요금은 다음과 같습니다 
//0분부터 9분까지 무료, 10분부터 19분까지 1000원, 이후 10분당 1000원씩 추가
//12시40분에 들어와서 16시10분에 나간 차량의 주차시간과 요금 구해서 출력
import java.lang.*;
public class Test08 {
	
	public static void main(String[] args) {
		
		//준비
		int inHour = 12, inMinute = 40;
		int outHour = 16, outMinute = 10;
		int periodPrice = 1000;
		
		//계산
		int inTime = inHour * 60 + inMinute;
		System.out.println(inTime);
		int outTime = outHour * 60 + outMinute;
		System.out.println(outTime);
		
		int time = outTime - inTime;
		System.out.println(time);
		
		//요금
		int price = time / 10 * 1000;
		
		//시간
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		System.out.println("주차요금은 다음과 같습니다");
		System.out.println(price);
		
		System.out.println("주차시간");
		System.out.println(hour);
		System.out.println(minute);
	}

}
