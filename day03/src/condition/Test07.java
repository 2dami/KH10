package condition;
//'무조건 1인 1박에 10만원' 슬로건의 KH여행사.
// 여름 여행객 유치를 위한 추가 이벤트로 여름(6,7,8월) 여행자 이용요금 25% 할인 결정.
// 다음 정보에 따른 예상 여행 경비를 계산하여 출력하도록 프로그래밍하라.
//1. 인원수(명) , 2.여행기간(일) , 3.여행 계획중인 달 (1월~12월 사이)
import java.lang.*;
public class Test07 {
public static void main(String[] args) {
	
	//준비
			int count = 1;
			int day = 1;
			
			int month = 6;
					int discount = 25;
			
			//계산
					int price =  day * count * 100000;
					
					//int result; 
						//if(month >= 6 && month <= 8 ) {
							//result = price * 75 / 100;
					
			//출력
//if ( month == 6  || month == 7 || month == 8 )
//if ( month >= 6  &&  month <= 8 )
					int total;
if (5 < month && month <9) {
	total = price * (100 - discount ) / 100; //할인된금액
	//출력
	System.out.println(month + "월 경비 : " + count +"인" + day + "박에" + total + "만원");
}
else{
	total = price; //원래금액
System.out.println(month + "월 경비 : " + count +"인" + day + "박에" + total + "만원");
}
}
}

