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
		int range =  r.nextInt(100) +1;
		int level = 0;
		while (true) {
		if (range <= 25) {
			System.out.println("성공");
			level++;
		}
		else if (range <=25 ){
			System.out.println("실패");
			level--;
		}
		else {
			
		}
		}
		
		
	}

}
