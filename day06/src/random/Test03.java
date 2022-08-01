package random;
import java.util.Random;
import java.util.Scanner;

//랜덤으로 구구단 문제를 하나 출제하고 사용자가 정답을 입력하면 정답과 오답을 판정하는 프로그램을 구현
//단, 문제는 2x1부터 9x9의 범위 내에서 출제해야 합니다
public class Test03 {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = r.nextInt(8)+2;
		int b = r.nextInt(9)+1;
		
		System.out.println(a + "x" + b );
		
		int user = sc.nextInt();
		
		if ( a * b == user) {
			System.out.println(" 정답 " );
		}
		else {
			System.out.println(" 오답 " );
		}
		sc.close();
	}
}
