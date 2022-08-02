package loop;
//타이머 만들기
//사용자가 분과 초를 설정하면 해당하는 시간만큼의 메세지 출력 후 종료되는 프로그램을 구현
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		int minute = 2;
		int second = 10;
		
		int time = (minute *60) + second ;
		
		for (int i=time; i >= 0;  i-- ) {
			System.out.println ( i / 60 + "분" + i%60 + "초 남았습니다.");
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
}
