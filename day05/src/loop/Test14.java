package loop;
import java.util.Scanner;
//사용자에게 숫자를 하나 입력받아 해당하는 숫자의 구구단을 출력(ex : 5 입력시 구구단 5단 출력)
//사용자는 출력된 구구단을 보고 정답을 입력하며 프로그램에서는 정답 여부를 판정하여 카운트를 합니다.
//모든 문제가 출력되고 난 후 정답 개수와 오답 개수를 구하여 화면에 출력
//단 입력 / 게임 종료!  / 정답 ?개 / 오답 ?개
//import java.lang.*;
public class Test14 {
public static void main(String[] args) {
	// 숫자입력 /구구단 출력/ 정답판단 / 답 +오답 개수 카운트 
	
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int number = sc.nextInt();
	
	System.out.println( number + "단 시작 ! ");
	
	int oddCount = 0;
	int evenCount = 0;
	
	for (int i = 1 ; i <= 9 ; i++ ) {
	System.out.println( number + " * " + i );
		int a = sc.nextInt();

		if (a % number == 0 && a % i == 0) {
			oddCount++;
	}
		else {
			evenCount++;
		}
	}
	
	sc.close();

	//출력
	System.out.println("정답 개수 : " +oddCount );
System.out.println("오답 개수 : " +evenCount );
System.out.println("게임종료 ! " );	
}
}
