package oop.basic2;
//다음 데이터를 객체로 만들어 정보를 저장하고 출력 - FIFA 세계 축구 랭킹
// 순위	 국가	   점수
//  1	  브라질	  1828.45
//  2	  벨기에	  1823.42
//  3	  프랑스  1786.15

public class Test02 {
	public static void main(String[] args) {
			
		Ranking a = new Ranking();
		Ranking b = new Ranking();
		Ranking c = new Ranking();
		
		a.rank = 1;
		a.country = "브라질";
	     a.score = 1828.45f;
	     
	 	b.rank = 2;
		b.country = "벨기에";
	     b.score = 1823.42f;
	     
	 	c.rank = 3;
		c.country = "프랑스";
	     c.score = 1786.15f;
	
	     System.out.println(a.rank); 
	 	System.out.println(a.country);
	 	System.out.println(a.score);
	
	     System.out.println(b.rank); 
	 	System.out.println(b.country);
	 	System.out.println(b.score);
		
	     System.out.println(c.rank); 
	 	System.out.println(c.country);
	 	System.out.println(c.score);
	}
}
