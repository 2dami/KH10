package random;

import java.util.Random;
import java.util.Scanner;

//업다운 게임 - 숫자를 하나 정해두고 이를 맞추는 게임.
//프로그램이 랜덤으로 1에서 1000 사이의 숫자를 하나 정합니다.
//사용자가 범위 내에서 숫자를 입력합니다.
//프로그램은 사용자가 입력한 값과 정답을 비교해서 업, 다운, 정답 세 개중 하나를 알려줍니다.
// - '업'은 정답이 입력값보다 크다는 의미입니다.
// - '다운'은 정답이 입력값보다 작다는 의미입니다.
// - '정답'은 정답과 입력값이 같은 경우를 말하며, 게임이 종료되어야한다.
//업다운 게임을 구현하시고 정답을 맞추면 몇번 만에 맞췄는지 계산해서 출력
public class Test07 {
public static void main(String[] args) {
	//1회 업다운게임
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	
	//정답 생성
	int com = r.nextInt(1000) + 1;
	System.out.print("com = " + com );
	
	int count = 0;
	
	while(true) {
	//사용자 입력
	System.out.print("입력: ");
	int user = sc.nextInt();
	
	count++;
	
	//판정
	if(com > user) {
		System.out.println("업");
	}
	else if (com <  user) {
		System.out.println("다운");
	}
	else {
		System.out.println("정답");
		break;
	}
	}
	sc.close();
	
	System.out.println("총" +count + "번만에 맞추셨습니다.");
}
}
