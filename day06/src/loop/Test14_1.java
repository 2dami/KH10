package loop;

import java.util.Scanner;

public class Test14_1 {

	public static void main(String[] args) {
		//추가: 점수계산 - 맞추면 +10점. 틀리면 -10점
		int score = 0;
		
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
			score +=10;
		}
			else {
				wrongCount++;
				score -=10;
			}
		}
		sc.close();
		System.out.println( " 정답개수" + correctCount++ );
		System.out.println(" 오답개수" + wrongCount++);
		System.out.println(" 점수 : ");

	}

}
