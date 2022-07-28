package condition2;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//사용자에게 월을 입력받아 해당 월의 마지막 날짜를 구하여 출력 프로그램을 구현
		// 2월은 28일까지 있다고 가정  
		// 4, 6, 9, 11월은 30일까지 ,1, 3, 5, 7, 8, 10, 12월은 31일까지 있다.
		
		int month = 5;

				switch(month) {
				case 2:
					System.out.println("해당 월의 마지막 날짜는 28일 입니다.");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("해당 월의 마지막 날짜는 30일 입니다.");
					break;
					default:
						System.out.println("해당 월의 마지막 날짜는 31일 입니다.");

	}
}
}