package oop.method4;
//데이터를 객체로 만들어 정보를 저장하고 출력
//커피숍 메뉴 정보
//이름	        분류	   가격	  행사여부
//아메리카노	음료	   2500	행사중
//모카라떼	    음료	   3500	-
//치즈케이크	디저트 5000	    행사중
//마카롱	        디저트 3000	    -
public class Test04 {
	public static void main(String[] args) {
	
	Menu a = new Menu();
	Menu b = new Menu();
	Menu c = new Menu();
	Menu d = new Menu();
	
	a.setting("아메리카노","음료",2500, true);
	b.setting("모카라떼","음료",3500 );
	c.setting("치즈케이크","디저트",5000, true);
	d.setting("마카롱","디저트",3000 );
	
	a.print();
	b.print();
	c.print();
	d.print();
}
}
