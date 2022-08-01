package random;

import java.util.Random;

//주사위를 100번 던졌을 때 홀수와 짝수가 각각 몇 번씩 나오는지 계산하여 출력
public class Test05 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int oddCount = 0, evenCount =0;
		
		for(int i =0; i <100; i++) {
		int dice = r.nextInt(6)+1;
		//System.out.println("주사위: " + dice );
	
		if(dice % 2 != 0) {
			oddCount++;
		}
		else {
			evenCount++;
		}
		}		
		System.out.println("홀수: " + oddCount );
		System.out.println("짝수: " + evenCount );
	}

}
