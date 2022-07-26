package data;
//커피숍 메뉴는 다음과 같습니다 아메리카노 1300원,라떼 2000원.
//우리팀에서 아메리카노 마시는 사람은 4명, 라떼 마시는 사람이 3명일때 커피요금 계산하여 출력
import java.lang.*;
public class Test05 {

		  public static void main(String[] args) {

			 //준비
			  int americanoPrice = 1300;
	          int lattePrice = 2000;
	          int americanoCount = 4;
	          int latteCount = 3;
	          
	          //계산
	          int americanoTotal = americanoPrice * americanoCount;
	          int latteTotal = lattePrice * latteCount;
	          int total = americanoTotal + latteTotal;
	          
	          //출력
	          System.out.println("총 결제 금액은 다음과 같습니다");
	          System.out.println(total);
		  }
}
