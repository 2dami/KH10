package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
	//조건끼리의 계산(논리연산)
		//-and 연산: && 형태로 사용하며 양쪽다 true여야 true
		//-or연산: || 형태로 사용하며 양쪽다 false여야 false
		//나이가 주어져 있을때,청소년인지 판정해서 출력
		//청소년의 범위 - 중1(14살) 부터 고3(19살)까지
		
		//준비
		int age = 17;
		
		//계산
		//boolean teen = 14살 이상 19살 이하;
		//boolean teen = 14 <= age <= 19;
		boolean teen = 14 <= age && age <= 19;
		System.out.println("teen = " + teen);
		
		if(teen == true) {
			System.out.println("청소년입니다");
		}
		if(teen == false) {
			System.out.println("청소년이 아닙니다");
	}
}
}
