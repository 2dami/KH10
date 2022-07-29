package loop;
//다음 규칙에 따라 369 게임을 시뮬레이션하세요
//1부터 순차적으로 숫자가 증가하며 출력됨
//3 또는 6 또는 9가 들어있는 숫자라면 해당하는 숫자 개수만큼 "짝" 이라고 출력
//ex : 36 - 짝짝 , 35 - 짝
//범위는 99까지 출력합니다
//import java lang*;
public class Test07 {
	public static void main(String[] args) {
		
		//(1) 1부터99까지 화면에 출력
	for(int i = 1 ; i <= 99 ; i++) {
			//(2) 박수치는 숫자 / 아닌숫자 구분하여 출력 if( 3/6/9 가 있는 숫자라면 )
			//if( i/10 == 3 || i%10 == 3 &&  i/10 == 6 || i%10 == 6 &&  i/10 == 9 || i%10 == 9 )
			//System.out.println("박수");
			//boolean three =  i/10 == 3 || i%10 == 3 ;
					//boolean six = i/10 == 6 || i%10 == 6;
					//boolean nine =  i/10 == 9 || i%10 == 9;
					
			//또는 (십의자리와 일의 자리로 구분하면.)
					boolean ten =  i/10 == 3 ||  i/10 == 6 ||  i/10 == 9;
					boolean one =  i%10 == 3 || i%10 == 6 || i%10 == 9;
					
					if(ten || one) {
						if( ten && one) {
							System.out.println("짝짝");
						}
						else  {
							System.out.println("짝");
						}
					}
						else {
							System.out.println(i);
						}
					}
	}		
}


