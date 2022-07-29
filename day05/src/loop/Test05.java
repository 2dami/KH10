package loop;
//import java.lang.*;
public class Test05 {
public static void main(String[] args) {
	//(Q) 1부터 100까지 홀수/짝수를 출력
	
	//홀수 : 1 ,3,5,7,9,.........99
	for(int i = 1 ; i <=99 ; i +=2) {
		System.out.println(" 홀수 =" + i);
	}  // ---------50번 실행 (사람이 고민해야함)
	
	for(int i = 1; i <= 100; i++) {
		if(i %2 ==1) { //홀수라면
			System.out.println(" 홀수 =" + i);
		} // ----------------100번 실행 (컴이 알아서 해주니 더 좋은방법!)
	}
	
	//짝수
	for(int i = 2 ; i <=100 ; i +=2) {
		System.out.println(" 짝수 =" + i);
	}
	for(int i = 2; i <= 100; i++) {
		if(i %2 == 0) { 
			System.out.println(" 짝수 =" + i);
		}
}
}
}