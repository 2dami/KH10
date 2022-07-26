package data;
//영화관 요금표는 다음과 같습니다.
//-성인 : 12000원 , 청소년: 7500원
//성인 2명과 청소면 3명이 영화를 볼때 이용요금을 출력
import java.lang.*;
public class Test04 {
	  public static void main(String[] args) {

		  int adult = 12000;
          int kids = 7500;
          int adultCount = 2;
          int kidsCount = 3;
          
          int adultTotal = (adult * adultCount);
          int kidsTotal = (kids * kidsCount);
          int total =(adult * adultCount + kids * kidsCount );
 
         System.out.println(total);
      }
}