package api.util.collection2;

import java.util.TreeSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		//Set
		//- 중복이 없는 저장소
		//- 순서가 정해진 저장소
		
		TreeSet a = new TreeSet();
		TreeSet<String> b = new TreeSet<>();
		Set<String> c = new TreeSet<>();
		
		//추가 - .add()
		c.add("마리오");
		c.add("루이지");
		c.add("쿠파");
		c.add("피오나");
		
		//검색 -.contains
		System.out.println(c.contains("피카츄")); //없음
		System.out.println(c.contains("루이지")); //있음
		
		//삭제 - .remove
		c.remove("마리오");

		System.out.println(c);
		System.out.println(c.size());
		
		//주의 - .get()이 없다.
		
	}

}
