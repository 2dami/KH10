package random;
import java.util.Random;
import java.util.Scanner;

//사용자가 3번 틀릴 때까지 무작위로 구구단 문제를 출제하는 프로그램을 구현
//3번 틀리면 게임오버가 되며 그동안 맞춘 문제 개수가 출력되어야 합니다.
public class Test04 {
public static void main(String[] args) {
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	int wrongCount = 3; //"누적 계산"되어야 하므로 반복문 밖에 선언해 놓는다..!
	int correct = 0;
	while(true) {
	int a = r.nextInt(8)+2;
	int b = r.nextInt(9)+1;
	
	System.out.println(a + "x" + b );
	
	int user = sc.nextInt();
	
	if ( a * b == user) {
		//System.out.println(" 정답 " );
		correct++;
	}
	else {
		wrongCount--;
		System.out.println(" 남은기회"  + wrongCount + "번" );
		if (wrongCount == 0) {
			break;
		}
		
	}
	sc.close();
	System.out.println(" 게임 오버");
	System.out.println(" 맞힌 개수 : " + correct + "개");
}
}
}