package odd.method3;
//다음 데이터를 객체로 만들어 정보를 저장하고 출력
// 우리반 학생 시험성적 정보
// 이름	국어	영어	수학	총점	평균
//피카츄  90	 90	 85	  -	     -
//라이츄	  80	 90	 85	  -      -
//꼬부기	 100	 90	 90	  -      -
// - 총점과 평균은 자동계산 되도록 구현
public class Student {
	String name;
	int korean;
	int english;
	int math;
	int total;
	double average;

void setting(String name,int korean,int english,
		             int math) { //----총점,평균은 출력메소드에만..!!
	this.name = name;
	this.korean = korean;
	this.english = english;
	this.math = math;
	this.total = korean + english + math;
	this.average = total /3.0;
}
void print() {
	System.out.println( "이름 : " + this.name);
	System.out.println( "국어 : " + this.korean);
	System.out.println( "영어 : " + this.english);
	System.out.println( "수학 : " + this.math);
	System.out.println( "총점 : " + this.total);
	System.out.println( "평균 : " + this.average);
}

}