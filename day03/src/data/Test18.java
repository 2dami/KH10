package data;
//2000년생 편의점 담배 구매시도. 구매가능여부 판정해서 출력
//(담배는 한국나이 20세 이상 구매가능)
import java.lang.*;
import java.util.Calendar;
public class Test18 {
	public static void main(String[] args) {
		//한국식 나이는 태어난 해부터 현재까지의 숫자 개수
		// = 두개의 숫자 사이의 개수 
		
		//준비
		int year = 2000;
		//int now = 2022;
		int now = Calendar.getInstance().get(Calendar.YEAR); 
		
		//계산
		int age = now - year + 1;
		//System.out.println(age); //23
		
		boolean adult = age >= 20;
		
		//출력
		System.out.println(adult); //- True
		
	}
}
