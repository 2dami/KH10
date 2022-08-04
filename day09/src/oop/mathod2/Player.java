package oop.mathod2;
//다음 데이터를 객체로 만들어 정보를 저장하고 출력
//이름	종목	구분	금메달	은메달	동메달
//진종오	사격	하계	4	2	0
//김수녕	양궁	하계	4	1	1
//전이경	쇼트트랙	동계	4	0	1
public class Player {
	String name;
	String sport;
	String season;
	int gold;
	int silver;
	int bronze;
	
	void setting (String name, String sport, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.sport = sport;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	void print() {
		System.out.println( "이름 : " + this.name);
		System.out.println( "종목 : " + this.sport);
		System.out.println( "구분 : " + this.season);
		System.out.println( "금메달 : " + this.gold);
		System.out.println( "은메달 : " + this.silver);
		System.out.println( "동메달 : " + this.bronze);
	}
	
}
