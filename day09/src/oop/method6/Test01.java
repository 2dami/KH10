package oop.method6;
//다음 데이터를 요구사항에 맞게 구조화하고 출력하세요
//### 온라인 쇼핑몰 상품 정보
//| 상품명 | 상품분류 | 판매가 | 새벽배송 | 행사여부 |
//| :---: | :---: | :---: | :---: | :---: |
//| 참이슬후레쉬 | 주류 | 1200 | 가능 | 행사중 |
//| 클라우드맥주 | 주류 | 3000 | 불가능 | 행사중 |
//| 바나나킥 | 과자 | 1500 | 불가능 | 행사중 |
//| 허니버터칩 | 과자 | 2000 | 가능 | 해당없음 |

//### 요구사항
//- 새벽배송이 가능한 상품은 2500원의 배송비가 추가됨을 출력 시 표시해야 함.
//- 행사중인 상품은 가격 옆에 "행사중"이라고 출력해야 합니다 
//- 행사중인 상품은 가격을 10% 할인해서 출력해야 합니다
public class Test01 {
	public static void main(String[] args) {
		
	
	Product a = new Product();
	Product b = new Product();
	Product c = new Product();
	Product d = new Product();
	
	a.setting("참이슬후레쉬","주류",1200,true,true);
	b.setting("클라우드맥주","주류",3000,false,true);
	c.setting("바나나킥","과자",1500,false,true);
	d.setting("허니버터칩","과자",2000,true,false);
	
	a.print();
	b.print();
	c.print();
	d.print();
	}
}
