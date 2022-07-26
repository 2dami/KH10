package data;
//커피숍 메뉴는 다음과 같습니다 아메리카노 1300원,라떼 200원.
//우리팀에서 아메리카노 마시는 사람은 4명, 라떼 마시는 사람이 3명일때 커피요금 계산하여 출력
import java.lang.*;
public class Test05 {

		  public static void main(String[] args) {

			  int americano = 1300;
	          int latte = 2000;
	          int americanoCount = 4;
	          int latteCount = 3;
	          
	          int americanoTotal = (americano * americanoCount);
	          int latteTotal = (latte * latteCount);
	          int total = (americano * americanoCount + latte * latteCount);
	          
	          System.out.println(total);
		  }
}
