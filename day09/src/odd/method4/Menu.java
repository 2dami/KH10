package odd.method4;

public class Menu {
	String name;
	String part;
	int price;
	String event;
	
void setting (String name,String part,int price,String event) {
	
	this.name= name;
	this.part = part;
	this.price =price;
	this.event= event;
}
void print() {
	System.out.println( " <커피숍 메뉴정보> ");
System.out.println( "이름 : " + this.name);
System.out.println( "분류 : " + this.part);
System.out.println( "가격 : " + this.price);
System.out.println( "행사여부 : " + this.event);
}
}
