package loop;

import java.util.Scanner;

// import java.lang.*;
public class Test09 {
public static void main(String[] args) {
	//소수 판정 프로그램
	//소수 - 1과 자신으로만 나눠지는 숫자 (ex : 2,3,5,7,11,13,17,19,23,....)
	
	//준비
	Scanner sc = new Scanner (System.in);
	System.out.println(" 숫자입력 :");
	int number = sc.nextInt();
	sc.close();
	int count = 0;
	
	//계산 - 1부터 number까지의 숫자로 나누기를 시도
	for (int i = 1 ; i <= number; i++) {
		//System.out.println(number +"%"+ i + "="+number %i);
		if(number % i == 0 ) { //number가 i로 나누어 떨어진다면
			//System.out.println("찾았다!");
			count++;
		}
	}
	//System.out.println("count=" + count );
	
	//출력
	if(count ==2) {
	System.out.println(number +"- 소수입니다");
	}
	else {
	System.out.println(number +"- 소수가 아닙니다");
}
}
}
