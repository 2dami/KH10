package data;
// BMI계산기 - BMI는 체질량지수(비만지수)를 말합니다
//구하는 공식은 'BMI = 체중(kg) / 키(cm)' 입니다.
//키가 180cm이고, 체중이 80kg인 사람의 BMI 지수를 출력
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {
		
		//준비
		int weight = 80;
		int height = 180;
		float a = (float) height / 100;
		//System.out.println(a);
		
				
	 //계산
		float bmi =(float) weight / (a* a);
		
		//출력
		System.out.println("키가 180cm이고, 체중이 80kg인 사람의 BMI 지수");
		System.out.println(bmi);
}
}