package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//map<K,V>
		//k(key)와v(value)를 세트로 저장하는 저장소
		//k는중복불가,v는 중복가능
		//k만보면 set<k>와 같다 (set에 value가 하나씩 붙어있는 상태)
		
		//ex) 이름과 나이를 저장하는 저장소
		// k - 이름 (String) , v - 나이 (Integer)
		//Map<String,Integer> people = new TreeMap<>();
		Map<String,Integer> people = new HashMap<>();
		
		//추가 - .add()는 데이터 1개를 추가하는 명령.
		// 2개는 .put() 명령으로 추가하도록 설계
		people.put("유재석", 50);
		people.put("박명수", 51);
		people.put("정형돈", 44);
		people.put("하하", 42);
		people.put("노홍철", 43);
		
		people.put("하하", 44);//중복된 key가 추가될 경우 value가 수정됨
		
		//검색 - .contains()가 아니라 key,value로 각각 존재
		System.out.println(people.containsKey("정준하")); // false
		System.out.println(people.containsValue(50));
		
		//삭제
		people.remove("노홍철");
		
		//추출 - 박명수가 몇살인가요?
		System.out.println(people.get("박명수"));
		
		//주의 -null이 나올수도 있는 상황이라면 원시형을 사용할수 없다.
		String name = "길";
		Integer age = people.get(name);
		System.out.println("나이=" + age);
		
	
		System.out.println(people);
		System.out.println(people.size());
		System.out.println(people.isEmpty());
		
	}

}
