package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

//다음 요구사항에 따른 계산을 수행하여 결과를 출력
//철수와 영희는 각자 국내에서 상영하는 영화를 다음과 같이 봤습니다
//- 철수 : `이상한 나라의 수학자`, `더 배트맨`, `인민을 위해 복무하라`, `블랙라이트`
//- 영희 : `더 배트맨`, `스파이더맨 : 노웨이 홈`, `블랙라이트`, `우리가 사랑이라고 믿는 것`
//- (Q) 철수와 영희가 둘 다 본 영화 목록을 출력하세요
//- (Q) 철수와 영희 중 한 명만 본 영화 목록을 출력하세요
public class Test07 {
	public static void main(String[] args) {
		
		Set<String> man =  new TreeSet<>();
		man.add("이상한 나라의 수학자");
		man.add("더 베트맨");
		man.add("인민을 위해 복무하라");
		man.add("블랙라이트");
		
		Set<String> woman =  new TreeSet<>();
		
		woman.add("더 베트맨");
		woman.add("스파이더맨 : 노웨이 홈");
		woman.add("블랙라이트");
		woman.add("우리가 사랑이라고 믿는 것");
		
		Set<String> c = new TreeSet<>();
		c.addAll(man);
		c.retainAll(woman);
		System.out.println("둘 다 본 영화 목록: " + c);
		
		Set<String> d = new TreeSet<>();
		Set<String> e = new TreeSet<>();
		d.addAll(man);
		d.removeAll(woman);
		e.addAll(woman);
		e.removeAll(man);
		
		Set<String> f = new TreeSet<>();
		f.addAll(d);
		f.addAll(e);
		
		System.out.println("둘 중 한 명만 본 영화 목록: " + f);
			
	}

}
