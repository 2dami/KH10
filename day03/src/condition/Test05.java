package condition;
//짜장 5천 짬뽕 6천 , 3그릇 이상 주문시 10프로 할인 
//임의의 짜장 짬뽕 주문 수량에 대해 결제금액 계산
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		
		int jjajang = 5000;
		int champon = 6000;
		int jjajangCount = 2;
		int champonCount = 1;
		int discount = 10;
		
		//계산
		int count = jjajangCount + champonCount;
		int jjajangTotal = jjajang * jjajangCount;
		int champonTotal = champon * champonCount;
		int total = jjajangTotal + champonTotal;
		
		//출력
		//문제점 할인률이 10프로로 주어졌는데 0.9를 곱하면 계산이 어려워짐..?
		//할인 적용/미적용 시 다른조건은 같으니 가격계산만 따로 할수 없을까>
		//int total = 원래금액 or 할인된금액;
		
		
		if (count >= 3) {
			total = (jjajangTotal + champonTotal) * (100 - discount ) / 100; //할인된금액;
		}
		else{
			total = jjajangTotal + champonTotal; //원래금액
		}
		System.out.println("결제금액은" + total + "원 입니다");
	}
}

		//if( count >= 3 ) {
		//	System.out.println("할인적용");
			//int discountPrice = total * (100 - discount) / 100;
			//System.out.println("결제금액은" + total * 0.9 + "원 입니다");
		//}
	//	else
			//System.out.println("할인미적용");


