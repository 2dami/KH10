package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05_1 {
	public static void main(String[] args) {
		//집합 연산
		Set<Integer> a = new TreeSet<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		Set<Integer> b = new TreeSet<>();
		b.add(3);
		b.add(4);
		b.add(5);
		
		// 합집합
		Set<Integer> c = new TreeSet<>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c); // [1, 2, 3, 4, 5]
		
		//교집합
		Set<Integer> d = new TreeSet<>();
		d.addAll(a);
		d.retainAll(b);
		System.out.println(d);
		
		//차집합(a-b,b-a)
		Set<Integer> e = new TreeSet<>();
		e.addAll(a);
		e.removeAll(b);
		System.out.println(e);
		
	}
}
