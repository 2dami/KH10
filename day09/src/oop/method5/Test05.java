package oop.method5;
//다음 데이터를 요구사항에 맞게 구조화하고 출력
//휴대폰 판매 정보
// 이름	     통신사	  가격	   약정개월
//갤럭시22s	SK	180만원	설정하지 않음
//갤럭시22s	KT	175만원	24개월
//아이폰13	LG	200만원	30개월
//아이폰13	SK	199만원	설정하지 않음

//약정기간을 설정한 경우에는 월 할부금을 계산해서 출력
//월 할부금은 판매가격을 약정기간동안 나눠서 낸다고 가정하고 계산
//약정기간을 설정하지 않은 경우에는 가격 옆에 (약정 없음) 을 출력
//약정기간을 설정하지 않은 경우에는 5% 할인된 가격으로 출력
public class Test05 {
	public static void main(String[] args) {
		
		SmartPhone p1 = new SmartPhone();
		SmartPhone p2 = new SmartPhone();
		SmartPhone p3 = new SmartPhone();
		SmartPhone p4 = new SmartPhone();
	
		p1.setting("갤럭시22s","SK",1800000);
		p2.setting("갤럭시22s","KT",1750000,24);
		p3.setting("아이폰13","LG",2000000,30);
		p4.setting("아이폰13","SK",1990000);
		
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		
		}
}
