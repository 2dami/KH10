package condition;
//지하철 요금은 다음과 같습니다
//어르신(65세~) : 무료 / 성인(20~64세) : 1250원
//청소년(14~19세) : 720원 / 어린이(8~13세) : 450원 /영유아(~7세) : 무료
//출생년도 4자리가 주어졌을 때 지하철 요금을 계산하여 출력하는 프로그램을 구현
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		
		//준비
		int adult = 1250;
		int teen = 720;
		int kids = 450;
		
		//int birth = 19890828 (출생년월일 입력시)
		//int year = birth / 10000
		int year = 2020;
		int now = 2022;
		
		//계산
		int age = now - year + 1;
		
		//출력
		
		int price;
		if(age < 8 || age >= 65) {
			price = 0;
		}
		else if( age >= 20) {
			price = 1250;
		}
		else if( age >= 14) {
			price = 720;
		}
		else {
			price = 450;
		}
		System.out.println("요금 : " + price + "원");
		
		//if( age < 8 || age >= 65) {
			//System.out.println("지하철요금은 무료입니다.");
		//}-----첫 조건을 
		
		if( age >= 8 && age <= 13) {
			System.out.println("지하철요금:" + kids);
		}
		else if( age >= 14 && age <= 19) {
				System.out.println("지하철요금:" + teen);
		}
			else if(  age >= 20 && age <= 64 ) {
			System.out.println("지하철요금:" + adult);
		}
			else {
				System.out.println("지하철요금은 무료입니다.");
			}
				}
	}