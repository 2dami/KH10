package oop.method3_1;
//다음 데이터를 객체로 만들어 정보를 저장하고 출력
// 우리반 학생 시험성적 정보
// 이름	국어	영어	수학	총점	평균
//피카츄  90	 90	 85	  -	     -
//라이츄	  80	 90	 85	  -      -
//꼬부기	 100	 90	 90	  -      -
// - 총점과 평균은 자동계산 되도록 구현
public class Student {
	//멤버 필드(member field)
	String name;
	int korean;
	int english;
	int math;

	// 멤버 메소드
void setting(String name,int korean,int english,
		             int math) {
	this.name = name;
	this.korean = korean;
	this.english = english;
	this.math = math;
}

void print() {
	int total = this.korean + this.english + this.math;
	double average = total / 3.0;

	System.out.println( " <학생 정보> ");
	System.out.println( "이름 : " + this.name);
	System.out.println( "국어 : " + this.korean + "점");
	System.out.println( "영어 : " + this.english + "점");
	System.out.println( "수학 : " + this.math + "점");
	System.out.println( "총점 : " + total + "점");
	System.out.println( "평균 : " + average + "점");
}
}