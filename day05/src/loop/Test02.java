package loop;
import java.util.Scanner;
// 사용자에게 숫자를 5개 입력받는 프로그램을 구현
public class Test02 {
	public static void main(String[] args) {
		
		// (!!주의!!) 도구는 반복문 내에서 만들지 않는다.
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자 5개를 입력하세요");
		for(int i=0 ; i < 5 ; i++) {
		int a = sc.nextInt();
		sc.close();
	}
	}
}
