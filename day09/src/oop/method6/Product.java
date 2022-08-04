package oop.method6;

public class Product {
	String name;
	String type;
	int price;
	boolean delivery;
	boolean event;
	
//method
void setting (String name, String type, int price) {
	this.setting(name,type,price,false,false);
}
	void setting (String name, String  type, int price, boolean delivery){
		this.setting(name,type,price,delivery,false);
	}
	
//(주의사항) 매소드 오버로딩은 형태까지 같은경우는 불가능 하다.
	// void setting(String name, String type, int price, boolean event) {
	// this.setting(name, type, price, false, event);
	//}
	
		void setting (String name, String type, int price,
				boolean delivery, boolean event) {
			this.name = name;
			this.type = type;
			this.price = price;	
			this.delivery = delivery;
			this.event = event;
		}
			
void print() {
	// 새벽배송과 행사여부는 상품 정보 옆에 추가로 출력
	
	System.out.print( "< 상품 정보 >");
	if(this.delivery) {
		System.out.println( "새벽배송");
		}
		if(this.event) {
		System.out.println( "행사상품");
		}
		System.out.println();
	System.out.println( "상품명: " + this.name);
	System.out.println( "상품분류: " + this.type);
	
	if(this.event) {
		int discountPrice = this.price * 90 / 100;
		System.out.println( "판매가: " + discountPrice +"원(원래가격 "+this.price+"원)");
	}
	else {
		System.out.println( "판매가: " + this.price + "원" );
	}
	if(this.event) {
	System.out.println( "(배송비 +2500원)");
	}
	System.out.println();
}
}
