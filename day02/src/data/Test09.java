package data;
//KH pc방 요금은 1시간에 1200원 입니다. 
//만약 요금이 10원단위로 나올경우 해당요금은 받지 않습니다.(ex) 1250원이면 1200원만 받는다
//12시40분부터 16시10분까지 이용한 고객의 요금을 출력
import java.lang.*;
public class Test09 {
public static void main(String[] args) {
		
		//준비 - 시작시각, 종료시각,시간당요금
	int inHour = 12, inMinute = 40;
	int outHour = 16, outMinute = 10;
	int pricePerHour = 1200;
	
	//계산
	int inTime = inHour * 60 + inMinute;
			//System.out.println(inTime);
			int outTime = outHour * 60 + outMinute;
			//System.out.println(outTime);
			int time = outTime - inTime;
			
			//요금
			int pricePerMinute = pricePerHour / 60;
			//int price = 이용시간 * 분당요금
					int price = time * pricePerMinute;
					//System.out.println(price);
					
					int hour = time / 60;
					int minute = time % 60;
					
					//int fixPrice = price / 100 * 100; // 신규 변수 생성
					price = price / 100 * 100; //기존 변수 변경
					
					//출력
					System.out.println("이용시간은 다음과 같습니다");
					System.out.println(hour);
					System.out.println(minute);
					System.out.println("이용요금은 다음과 같습니다");
					System.out.println(price);
}
}
