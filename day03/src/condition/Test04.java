package condition;
//4자리로 출생년도가 주어졋을 때, 이 사람이 지하철 무임승차 대상인지 확인해서 알려주도록 구현
//(65세 이상의 어르신과 7세 이하의 영유아가 무임승차 대상)
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		//준비 - 출생년도 4자리
		int year = 2000;
				int now = 2022;
				
				//계산 - 나이
				int age = now - year +1;
				
				//출력
				System.out.println("당신의 나이는" + age +"세 입니다");
				
				//if(나이가 7살 이하 또는 65세 이상이라면)
				if(age <= 7 || age >= 65)  {
					System.out.println("무임승차 대상입니다");
				}
				//if(나이가 7살 초과 그리고 65세 미만이라면) {
				if(age > 7 && age < 65) {
					System.out.println("무임승차 대상이 아닙니다");
				}
				else { //if가 거짓말이면 
					System.out.println("무임승차 대상이 아닙니다");
			}
	}
}
				//boolean free= 7 >= age && age <= 65;
				
				//if(나이가 7살 초과 그리고 65세 미만이라면)
				//if(free == true ) {
				//	System.out.println("무임승차 대상입니다");
			//	}
				//if(free == false) {
					//System.out.println("무임승차 대상이 아닙니다");
