package random;
import java.util.Random;
public class Test01 {
	public static void main(String[] args) {
		//랜덤 (Random)
		//- 무엇이 나올지 예측이 되지 않는 값
		//- 주사위,로또,게임아이템뽑기, ...
		// - 확률적인 형태 구현 가능함
		//- 구현 방법은 여러가지
		// - (1) Math.random() 명령사용 - 0이상 1미만의 Double을 무작위로 만드는 명령
		// - (2) Random 도구사용
		//- (3) SecureRandom 도구사용
		
		//(1) Math.random() 명령 - 0이상 1미만의 Double을 무작위로 만드는 명령
		//System.out.println(Math.random());
		
		//double a = Math.random(); //0.xxx
		//System.out.println("a =" + a);
		
		//double b = a *10; //0.xxx ~ 9.xxx
		//System.out.println("b =" + b);
		
		//int c = (int)b; //0~9
		//System.out.println("c =" + c);
		
		//int d = c +1; //1~10
		//System.out.println("d =" + d);
		
		//공식 유도
		int number = (int)(Math.random() * 10/*개*/) + 1/*부터*/;  // 1부터 10개
		System.out.println("number =" + number);
		
		// (2) Random이라는 도구를 만들어서 값 생성
		// - 주의 : Random은 close()가 없다.
		Random r = new Random();
		
		int number2 = r.nextInt(10 /*개*/ ) + 1/*부터*/;
		System.out.println("number2 =" + number2);
			
	}

}
