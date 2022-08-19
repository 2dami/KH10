package api.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//List에 다음 데이터를 추가하고 무작위로 1개를 추첨하도록 구현
//자바, 파이썬, 루비, 안드로이드, 자바스크립트
public class Test04 {
	public static void main(String[] args) {
		//Java 8+
		//List<String> list = Arrays.asList("자바","파이썬","루비","안드로이드","자바스크립트")
		
		//Java 9+
		//List<String> list = List.of("자바","파이썬","루비","안드로이드","자바스크립트")
		
		//저장소 생성
		//- 배열처럼 한번에 데이터까지 초기화하면서 생성
		List<String> list = new ArrayList<>();
		
		
		//추가
		list.add("자바");
		list.add("파이썬");
		list.add("루비");
		list.add("안드로이드");
		list.add("자바스크립트");
	
		Random r = new Random();
		//int index = r.nextInt(5);
		int index = r.nextInt(list.size());
		
		System.out.println(list.get(index));
		
		
	}
}
