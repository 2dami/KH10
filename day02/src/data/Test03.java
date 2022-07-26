package data;
import java.lang.*;
public class Test03 {
      public static void main(String[] args) {
    	  //변수(variable)를 사용해서 Test02를 개선
    	  
    	  //변수 준비 (준비단계)
    	  int jjajang = 5000;//jjajang이란 이름의 저장소에 5000 저장!
    	  int champon = 6000;
    	  int jjajangCount = 2;
    	  int champonCount = 3;
    	  
    	  //System.out.println(jjajang * jjajangCount);
    	  //System.out.println(champon * champonCount);
    	  //System.out.println(jjajang * jjajangCount + champon * champonCount);
    	 
    	  //계산단계
    	  int jjajangTotal = jjajang * jjajangCount;//계산결과를 저장!
    	  int champonTotal = champon * champonCount;
    	  int total = jjajangTotal + champonTotal;
    			  
    	  //출력단계
    			  System.out.println(jjajangTotal);
    	  System.out.println(champonTotal);
    	  System.out.println(total);
      }
}
