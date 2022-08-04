package oop.method4;

public class Menu {
	String name;
	String part;
	int price;
	//String event;
	boolean event;
	
	//method
	
	//method overloading : 같은 이름으로 메소드를 여러개 준비하는 것 
void setting (String name,String part,int price) {
	this.setting(name,part,price,false);
}
void setting (String name,String part,int price,boolean event) {
	this.name= name;
	this.part = part;
	this.price =price;
	this.event= event;
}
void print() {
	System.out.println( " <커피숍 메뉴정보> ");
System.out.println( "이름 : " + this.name);
System.out.println( "분류 : " + this.part);
System.out.println( "가격 : " + this.price+"원");
if(this.event == true) {
	System.out.print("행사상품");
}
System.out.println( );
}
}
