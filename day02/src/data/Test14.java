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
		float heightM = (float) height / 100;
		//System.out.println(heightM); 
		
	 //계산
		float bmi =(float) weight / ( heightM * heightM );
		
		//출력
		System.out.println("키가 180cm이고, 체중이 80kg인 사람의 BMI 지수");
		System.out.println(bmi);
		// [수정한이유] 신장을 실수로 형 변환 할때, 변환한 변수명을 그냥 a로 만듦 (heightM로 변경)
}
}