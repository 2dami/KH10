package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05_2 {
	public static void main(String[] args) {
		//이름, 국어점수, 영어점수, 수학점수를 입력받아 총점과 평균을 계산하는 프로그램
		
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
//			if(name.length() < 2 || name.length() > 7) {
//			if(!(name.length() >= 2 && name.length() <= 7)) {
			if(!Pattern.matches("^[가-힣]{2,7}$", name)) {
				System.err.println("잘못된 입력입니다");
				return;//System.exit(1);
			}
			
			System.out.print("국어 : ");
			int korean = sc.nextInt();
			if(korean < 0 || korean > 100) {
				System.err.println("잘못된 입력입니다");
				return;
			}

			System.out.print("영어 : ");
			int english = sc.nextInt();
			if(english < 0 || english > 100) {
				System.err.println("잘못된 입력입니다");
				return;
			}
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			if(math < 0 || math > 100) {
				System.err.println("잘못된 입력입니다");
				return;
			}
			
			sc.close();
			
			int total = korean + english + math;
			float average = total / 3f;
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + average + "점");
		}
		catch(Exception e) {//Plan B
			System.err.println("입력이 잘못되었습니다");
		}
		
	}
}

