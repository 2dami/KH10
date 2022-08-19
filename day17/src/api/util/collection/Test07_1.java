package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_1 {
	public static void main(String[] args) {
		//풀이방법
		//2. 1~45까지 저장하고 섞은 뒤 6개 추첨.
		
		List<Integer> lotto = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++){
		lotto.add(i);
	}

		Collections.shuffle(lotto);
		//System.out.println(lotto);
		
		List<Integer> choice = new ArrayList<>();
		
		//앞에서 6개추첨
		for(int i=0; i< 6; i++ ) {
			choice.add(lotto.get(i));
		}
		
		Collections.sort(choice);
		for(int i=0; i< choice.size(); i++ ) 
		System.out.println(choice.get(i));
}
}
