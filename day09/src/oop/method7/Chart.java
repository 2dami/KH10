package oop.method7;
//다음 데이터를 요구사항에 맞게 구조화하고 출력
//제목	가수	앨범	재생수	좋아요 수
//그때 그 순간 그대로(그그그)	WSG워너비	WSG워너비 1집	104250	91835
//보고싶었어	WSG워너비	WSG워너비 1집	83127	90805
//LOVE DIVE	IVE(아이브)	LOVE DIVE	64590	174519
//POP!	나연(TWICE)	IM NAYEON	58826	70313
//[요구사항]
//재생 수가 10만이 넘어가면 제목 옆에 "베스트"라고 출력
//좋아요 수가 10만이 넘어가면 제목 옆에 "인기곡"이라고 출력
//차트 랭킹 계산 공식이 다음과 같을 때 랭킹 점수를 구하여 추가로 출력
// -랭킹 점수 = 재생수 * 2 + 좋아요 / 2
public class Chart {
	 String title;
		String name;
		String album;
		int play;
		int like;

	void setting(String title,String name,String album,int play) {
	this.setting(title, name, album, play);
	}

	void setting(String title,String name,String album,int play,int like) {
	this.title = title;
	this.name = name;
	this.album =album;
	this.play = play;
	this.like = like;
	}
	void print() {
	double ranking = (double) this.play *2 + this.like /2;

	System.out.println( " <음원차트> ");

	if(this.play >= 100000) {
		System.out.println( "제목 : " + this.title + " \"베스트\"");
	}
	else if (this.like>=100000) {
		System.out.println( "제목 : " + this.title+" \"인기곡\"");
	}
	else {
		System.out.println( "제목 : " + this.title);
	}
	System.out.println( "가수 : " + this.name);
	System.out.println( "앨범 : " + this.album);
	System.out.println( "재생수 : " + this.play);
	System.out.println( " 좋아요 수 : " + this.like);
	System.out.println( "랭킹점수 : " + ranking);
	}
	}

