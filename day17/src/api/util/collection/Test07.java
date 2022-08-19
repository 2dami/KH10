package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//이번주 로또 예상번호 추첨하여 출력
//단,번호는 낮은것부터 나와야함
public class Test07 {
	public static void main(String[] args) {
		
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		
		//두번째 방법
	//	while(list.size() < 6) {
			//int number1 =r.nextInt(45) + 1;
			//if(list.contains(number1)) {
			//	list.add(number1);
			//}
	//	}
		
		//첫번째 방법
			for(int i=0; i< 6; i++ ) {
				int number1 =r.nextInt(45) + 1;
				//if(list.contains(number1 == false))//한번도 뽑은적 없는 숫자라면
				if(list.contains(number1)) {
				list.add(number1);
			}
				
			Collections.sort(list);
			System.out.println(list);
			
			//for(int i=0; i< list.size()i; i++ ) {
			//System.out.println(list.get());		
			}
	}
}

//	for(int i = 1; i <= 45; i++){
//	list.add(i);
//}