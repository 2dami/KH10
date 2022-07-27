package condition;
//-50km를 초과하는 속도로 달리는 자동차 단속
//-벌금은 제한속도보다 10키로 늘어날때 10000원씩 증가
//-벌금은 시작이 30000원
//-벌금은 최대 7만원
import java.lang.*;
public class Test06 {
public static void main(String[] args) {
		//준비
	int speed = 45; 
	int limit = 50;
	
	//계산
	//boolean over = 주행속도 > 제한;
	boolean over = speed > limit;
	
	int fine;
	System.out.println("over=" + over);
	//if(over == true) {
	if(over) {
		 //fine = 30000 + 10km당 10000원 (벌금 계산결과);
		 //fine = 계산된 벌금 or 70000원;
		fine = 30000 + (speed - limit) / 10 * 10000;
		if(fine >= 70000) { //벌금이 7만원 이상이라면
			fine = 70000;
		}
		else {
			//할거없음
		}
	}
	else {
		fine = 0;
	}
	//출력
	System.out.println("예상벌금:"+fine+"원");
	}

}
