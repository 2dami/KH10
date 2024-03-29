package condition2;
//사용자에게 연도와 월을 입력받아 날짜 수를 구하는 프로그램 구현.
//윤년은 다음과 같은 규칙에 의해서 정해진다
//- 1년은 정확히 365일이 아니라 365.24xxx일이다
//- 대충 4년정도면 하루 약간 모자르게 시간이 늘어난다.
//- 4년마다 하루를 더 주면 시간이 약간 느려진다.
//- 100년마다 하루를 덜 주고 , 400년마다 하루를 더주면 정확히는 아니지만 날짜 엇비슷

//1. 연도가 4의 배수면 윤년이다.(ex : 2020, 2024, 2028년은 윤년)
//2. 4의 배수지만 100의 배수면 윤년이 아니다.(ex : 2100년은 윤년이 아님)
//3. 2번에 해당되더라도 400의 배수면 윤년이다.(ex : 2000년은 윤년)

import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
				Scanner sc = new Scanner (System.in);
		System.out.println("연도을 입력하세요");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		sc.close();
		
		
boolean leapYear = year % 4  == 0 && year % 400  == 0 ; 
				

		if(leapYear) {
			System.out.println( year + "는 윤년이고");
		}
		else {
			System.out.println( year + "는 윤년이 아니고");		
			
			
			if(month==2) {
				if( leapYear ) {
					System.out.println(" 2월의 날짜수는 29일 입니다.");
				}
				else {
					System.out.println(" 2월의 날짜수는 28일 입니다");
				}
			}
			
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println( month + "월의 날짜수는 31일 입니다.");
				break; 
			case 4: case 6: case 9: case 11:
				System.out.println( month + "월의 날짜수는 30일 입니다.");
				break;
				}
		}
	}
}

