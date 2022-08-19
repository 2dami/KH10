package api.util.collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//사용자에게 글 번호를 입력받아 해당하는 번호의 게시물에 좋아요를 설정/해제하는 프로그램을 구현

//사용자에게 입력받은 글 번호를 Set을 이용하여 저장하거나 삭제하도록 구현한다
//좋아요를 누른 적이 없는 글 번호가 입력된 경우 "?번 글에 좋아요를 눌렀습니다" 출력 후 저장소에 번호를 저장.
//좋아요를 누른 적이 있는 글 번호가 입력된 경우 "?번 글에 좋아요를 취소했습니다" 출력 후 저장소에서 번호를 제거.
//0을 입력하면 프로그램을 종료하고 종료 직전까지 좋아요를 누른 모든 게시글의 번호를 오름차순으로 출력.
public class Test03 {
	public static void main(String[] args) {
		
		Set<Integer> like =  new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("글 번호 :");
		int number = sc.nextInt();
		if(number == 0) { //0을 입력하면 종료되도록 처리(가장 먼저 검사)
			break;
		}
		
		
		if (like.contains(number)) {
			like.remove(number);
			System.out.println(number + "번호 게시글에 좋아요를 취소했습니다.");
		}
		else {
		like.add(number);
		System.out.println(number + "번호 게시글에 좋아요를 눌렀습니다.");
	}
}
		sc.close();
		//목록 출력
		System.out.println(like);
		
		//개별 접근은 불가능하지만 전체를 다 추출하는것은 가능하다.
		//1. Iterator이라는 별개의 저장소로 이동.
		Iterator<Integer> iter = like.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.println(number);
		}
		//2. 확장형 for 구문을 사용
		for(int number : like) { // like에 있는 데이터 개수만큼 몽땅
			System.out.println(number);
		}
		//3. 배열로 복사하거나 List로 복사.(비추천)
		
	}
}
