package loop;
import java.util.Scanner;
public class Test14_2 {
public static void main(String[] args) {
		//추가: 콤보 도입 (정답시 증가 / 오답시 초기화)
		int score = 0;
		int combo = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수: ");
		int dan = sc.nextInt();
		
		int correctCount = 0;
		int wrongCount = 0;
		
		for(int i =1 ; i<= 9 ; i++) {
		System.out.println(dan + "X " + i + " =" + dan * i);
		int user = sc.nextInt();
		if (dan * i == user ) {
			correctCount++;
			combo++;
			score += combo * 10;
		}
			else {
				wrongCount++;
				score -=10;
				combo = 0;
			}
		System.out.println("combo" + combo );
		}
		sc.close();
		System.out.println( " 정답개수" + correctCount++ );
		System.out.println(" 오답개수" + wrongCount++);
		System.out.println(" 점수 : ");

	}

}
