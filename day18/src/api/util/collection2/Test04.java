package api.util.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		// HashSet vs TreeSet
		Set<String> a = new HashSet();
		Set<String> b = new TreeSet();
		
		a.add("마리오");    b.add("마리오");
		a.add("루이지");    b.add("루이지");
		a.add("꼬부기");    b.add("루이지");
		a.add("라이츄");    b.add("루이지");
		a.add("뮤츠");       b.add("뮤츠");
		
		//글자에도 (해시)코드가 있기 때문에 정렬이 가능하다
		
		System.out.println("a =" + a); //정렬된거처럼 보이지 않음
		System.out.println("b =" + b); //Tree는 정렬이 되어서 보인다
	}

}
