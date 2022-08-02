package random;

import java.util.Random;

//풀이 안하고 코드만 올리는 과제 - 아에템 강화 시뮬레이션
// 강화 확률은 다음과 같다.
//- 성공 : 25% 확률로 아이템 레벨이 +1 된다.
//- 실패 : 25% 확률로 아이템 레벨이 -1 된다.
//- 현상유지 : 50% 확률로 아이템의 레벨이 변하지 않는다.
//0레벨의 아이템을 주어진 확률로 15레벨까지 만들기 위한 강화 횟수 구하여 출력
//[단, 아이템 레벨은 절대로 0보다 작거나 15보다 커지는 일은 없다.]
public class Test09 {
	public static void main(String[] args) {
Random r = new Random();
		
		int item = 0;
		
		int count = 0;
		
		while(true) {
			
			int enchant = r.nextInt(100) + 1;
			count++;
			
			if(enchant <= 25) {//성공
				if(item < 15) {
					item++;
					System.out.println("강화 성공");
				}
				else {
					System.out.println("이미 최대 레벨입니다");
				}
			}
			else if(enchant <= 50) {//실패
				if(item > 0) {
					item--;
					System.out.println("강화 실패");
				}
				else {
					System.out.println("강화 레벨이 더 이상 내려갈 수 없습니다");
				}
			}
			else {//현상유지
				System.out.println("아무 일도 일어나지 않았습니다");
			}
			
			System.out.println("현재 강화 레벨 : " + item);
			if(item == 15) {
				break;
			}
		}
		
		System.out.println("강화 시뮬레이션 종료!");
		System.out.println("강화 시도 횟수 : " + count+"번");
		
	}
}
