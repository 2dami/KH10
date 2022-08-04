package oop.basic3;

public class Test03 {
public static void main(String[] args) {
	//객체 생성
	Plan a = new Plan();
	Plan b = new Plan();
	Plan c = new Plan();
	//객체 초기화
	a.mobileCarrier = "SK";
	a.name = "5G언택트52";
			a.price = 52000;
			a.data = 200;
			a.freeMin = 1000;
			a.freeText = 2000;
			
			b.mobileCarrier = "KT";
			b.name = "5G세이브";
					b.price = 45000;
					b.data = 100;
					b.freeMin = 900;
					b.freeText = 1500;
					
					a.mobileCarrier = "LG";
					a.name = "5G시그니처";
							a.price = 130000;
							a.data = 500;
							a.freeMin = 2000;
							a.freeText = 2500;
							// 객체 정보 출력
							System.out.println(a.mobileCarrier); 
						 	System.out.println(a.name);
						 	System.out.println(a.price);
						     System.out.println(a.data); 
						 	System.out.println(a.freeMin);
						 	System.out.println(a.freeText);
						 	
						 	System.out.println(b.mobileCarrier); 
						 	System.out.println(b.name);
						 	System.out.println(b.price);
						     System.out.println(b.data); 
						 	System.out.println(b.freeMin);
						 	System.out.println(b.freeText);
						 	
						 	System.out.println(c.mobileCarrier); 
						 	System.out.println(c.name);
						 	System.out.println(c.price);
						     System.out.println(c.data); 
						 	System.out.println(c.freeMin);
						 	System.out.println(c.freeText);
					 	
}
}
