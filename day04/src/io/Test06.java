package io;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		// pc방 시간당 요금 1000원 시작/종료시간 입력받아 계산하도록 구현
		//(10원단위는 버림처리)
		
		//준비
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작시간:" );
		int in = sc.nextInt();
		System.out.println("종료시간:" );
		int out = sc.nextInt();
		sc.close();
		
		int inHour = in /100 , inMinute = in %100;
		int outHour = out /100 , outMinute = out %100;
		
	
		int inTime = (inHour * 60 ) + inMinute;
		int outTime = (outHour * 60) + outMinute;
		int time = outTime - inTime;
		
		System.out.println("이용시간 : " + time + "분" );
		
		double pricePerHour = 1000;
		double pricePerMinute = pricePerHour / 60;
		
		int total = (int) (time * pricePerMinute) / 100 * 100;
		//->값을 100으로 나눠 두자리수로 변경. (1916원->19)
		//여기서 다시 100을 곱해 천 단위로 복귀(19-> 1900)
		//****이때 int 입력해 정수로 값 출력****
	
		
		
		//출력
		System.out.println("이용 요금 : " + total + "원");	
	}
}
