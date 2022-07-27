package data;
//KH찜질방에선 장시간 머무르는 손님 없애기위해 최초입장 후 5시간 지나면 10분당 천원의 추가요금 부과.
//- 어떤 손님이 9시50분 들어와서 16시22분에 나가려고 할 때 이 손님이 추가요금 대상인지 출력
// -추가요금 대상일 경우 추가요금 출력  
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		//준비
		int inHour = 9 , inMinute = 50;
		int outHour = 16 , outMinute = 22;
		//int outHour = 15 , outMinute = 00; //경계값
		
		int inTime = (inHour *60) + inMinute;
		int outTime = (outHour *60) + outMinute;
		
		int time = outTime - inTime;
		//System.out.println( "time =" + time);
		
		//추가요금 대상여부
		boolean over = time >= 300;
		//System.out.println(over); //True
		
		//추가요금
		int charge = (time - 300) / 10 * 1000;
		System.out.println(charge);
		
		
	}
}
