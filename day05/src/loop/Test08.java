package loop;
//import java.lang*;
public class Test08 {
public static void main(String[] args) {
	//카운트,합계 측정
	
	// 1부터 100사이의 짝수개수를 구하여 출력하시오
	
	//반복 시작 전 변수 준비
	int count = 0;
	
	for (int i =1 ; i <= 100; i++) {
		if(i % 2 == 0) {
			//System.out.println(i);
			count++; //원하는 위치에서 카운트 변수 증가
		}
	}
	
	//종료 후 카운트 출력
	System.out.println("count=" + count );
	
}
}
