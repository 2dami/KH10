package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//기억력 테스트 게임
//사용자에게 나라 이름을 입력받아 List에 저장하도록 구현
//단, 입력한 적 있는 나라 이름을 다시 입력한 경우 입력을 중지하고 프로그램 종료
//프로그램 종료 시 여태까지 입력한 나라 이름을 순서대로 출력하도록 구현
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new  ArrayList<>();
		
		System.out.println("나라 이름:");
		String name = sc.nextLine();
		
		list.add(name);
		System.out.println(list);
		System.out.println(list.size());
	}

}
