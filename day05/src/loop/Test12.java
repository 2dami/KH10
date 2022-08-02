package loop;
//오늘부터 30일간 다이어트 , 매일매일 개수를 늘려가면서 푸시업을 할 계획
//첫째날은 힘드니까 3개만, 둘째날부터는 전날보다 3개씩 더 합니다
//(1) 30일 동안 일자별로 하게되는 푸시업 개수를 출력 
//(2) 30일 동안 하게되는 푸시업 개수의 총 합계를 출력
//import java.lang.*;
public class Test12 {
public static void main(String[] args) {
	
//일자를 기준으로 반복문 구현
	int pushup = 3;
	int total = 0;
	for(int day=1; day <=30; day++) {
		System.out.println(day +"일차 -" + pushup +"개");
		total+= pushup; // total 을 pushup 개수만큼 증가시키세요.
		pushup += 3;  // ====> pushup 코드의 위치 주의! (위로가면 1일차 6개 출력) 
	}
	System.out.println( "30일 동안 하게되는 푸시업 개수의 총 합계 : " + total );
	
}
}
// Test11 활용풀이 (내 답)
//int total = 0;
//for(int i=1; i<=30; i++) {
	//total += i * 3;
//System.out.println( "30일 동안 하게되는 푸시업 개수의 총 합계 : " + total );
