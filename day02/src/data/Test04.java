package data;
//영화관 요금표는 다음과 같습니다. -성인 : 12000원 , 청소년: 7500원
//성인 2명과 청소년 3명이 영화를 볼때 이용요금을 출력
import java.lang.*;
public class Test04 {
	  public static void main(String[] args) {

		  //준비
		  //(참고) = 는 같다가 아니라 우측의 값을 좌측에 집어넣는 '대입' 연산 기호
		  int adultPrice = 12000;
          int teenPrice = 7500;
          int adultCount = 2;
          int teenCount = 3;
          
          //계산
          int adultTotal =  adultPrice * adultCount;
          int teenTotal = teenPrice * teenCount;
          int total = adultTotal + teenTotal ;
 
          //출력
          System.out.println("성인 요금은 다음과 같습니다");
          System.out.println(adultTotal);
          System.out.println("청소년 요금은 다음과 같습니다");
          System.out.println(teenTotal);
          System.out.println("총 결제금액은 다음과 같습니다");
         System.out.println(total);
      }
}