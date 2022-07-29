package loop;
//import java.lang.*;
public class Test06 {
public static void main(String[] args) {
	//다음 값을 화면에 출력
//(1) 1부터 99 사이의 7의 배수 (2) 1부터 99 사이의 5가 들어간 숫자
	
	for(int i = 1; i <= 99; i++) {
		if(i % 7 == 0) { 
			System.out.println(" 1번(2)는" + i);
		}
		for(int i = 1; i <= 99; i++) {
		if(i /10 == 5 || i % 10 == 5) { //십의자리에 5 / 일의자리에 5가 들어간 숫자 
				System.out.println( i + "는 5가 들어간 숫자 ");
			}
		}
					
}
}


