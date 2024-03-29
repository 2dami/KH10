package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//List<E>
		
		ArrayList a = new ArrayList(); //저장할 형태를 미지정(자동으로 object)
		a.add(100);
		a.add("hello");
		
		ArrayList<Object> b = new ArrayList<Object>();// 저장할 형태 : Object
		ArrayList<String> c = new ArrayList<String>(); //저장할 형태 : String
		//c.add(100); - type불일치
		c.add("hello");//type일치
		
		//생성시 우측 Generic type을 생략할 수 있다.
		ArrayList<String> d = new ArrayList<>();
		
		//가급적 List로 업캐스팅하여 생성한다,
		List<String> e = new  ArrayList<>();
		List<String> f  = new LinkedList<>();
		
	}

}
