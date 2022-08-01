package random;

import java.util.Random;

// 다음 랜덤값을 구하여 화면에 출력
//1.주사위 1개를 던진 결과
//2.로또번호 1개를 추첨한 결과(1~45)
//3.OTP번호 1개를 생성한 결과(6자리 정수)
//4. 동전 던졋을때 예상되는 결과 (앞 또는 뒤)

public class Test02 {
public static void main(String[] args) {
	
	Random r = new Random();
	int number = r.nextInt(6)+1;
	System.out.println("주사위 1개를 던진 결과 : " + number );
	
	Random r2 = new Random();
	int lotto = r2.nextInt(45)+1;
	System.out.println(" 로또번호 추첨 결과 : " + lotto );
	
	Random r3 = new Random();
	//int otp = 0부터 999999까지
	int otp = r3.nextInt(900000)+100000; 	//100000부터 900000개
	System.out.println("OTP번호 생성 결과 : " + otp );
	
	Random r4 = new Random();
	//약속 - 0을 "앞"으로 간주하고 ,1을 "뒤"로 간주한다
	//int coin = 0부터 2개;
	int coin = r4.nextInt(2);
	if (coin == 0) {
		System.out.println(" 앞");
	}
	else {
	System.out.println(" 뒤 " );
}
}
}
