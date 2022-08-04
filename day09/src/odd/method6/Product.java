package odd.method6;

public class Product {
	String name;
	String part;
	int price;
	
	String event;
	

void setting (String name, String part, int price) {
	this.name = name;
	this.part = part;
	this.price = price;	
	
}
void print() {
	System.out.println( "< 상품 정보 >");
	System.out.println( "상품명: " + this.name);
	System.out.println( "상품분류: " + this.part);
	System.out.println( "판매가: " + this.price +"원");
	
	
	//System.out.println( "행사여부: " + this.event);
	
}

}
