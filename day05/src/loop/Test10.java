package loop;
import java.util.Scanner;
//사용자에게 10개의 숫자를 입력받아 짝수와 홀수 개수를 각각 구하여 출력
//import java.lang.*;
public class Test10 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int oddCount = 0;
	int evenCount = 0;
	
	for(int i=0; i <10; i++) {
		System.out.println(" 10개의 숫자를 입력하세요:");
		int a = sc.nextInt();
		
		if (a %2 == 1) {
			System.out.println("홀수입니다");
			oddCount++;
	}
		else {
			System.out.println("짝수입니다");
			evenCount++;
		}
	}
	
	sc.close();

	//출력
	System.out.println("홀수 개수 : " +oddCount );
System.out.println("짝수 개수 : " +evenCount );
}
}

