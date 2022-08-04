package odd.method5;

public class SmartPhone {
	String name;
	String tellecom;
	int price;
	int month;

	//method
void setting(String name,String tellecom,int price) {	
	this.setting(name,tellecom,price,0);
}
void setting(String name,String tellecom,int price,int month) {
	this.name = name;
    this.tellecom = tellecom;
    if (price >= 0) {
    this.price = price;
}
switch(month) {
case 0:
case 24:
case  30:
case 36:
	this.month = month;
}
}
void print(){
	if(this.month > 0) { // 약정기간이 있는 경우
		int pricePerMonth = this.price / this.month;
System.out.println( " <휴대폰 정보> ");
System.out.println( "이름 : " + this.name);
System.out.println( "통신사 : " + this.tellecom);
System.out.println( "가격 : " + this.price);
System.out.println( "약정개월 : " + this.month);
	}
	else {//약정기간이 없는 경우
		int discountPrice = this.price * 95 / 100;
		System.out.println("<휴대폰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.tellecom);
		System.out.println("가격 : " + discountPrice+"원 (원 가격 "+this.price+"원)");
		System.out.println("약정 없음");
	}
	
}
}
