package io;
// 사용자에게 신장(cm)과 체중(kg)을 입력받아서 BMI 지수를 계산하여 출력
//BMI 지수가 24.5가 넘으면 "비만" 아니면 "정상"으로 표시
//공식 : BMI = 체중(kg) / 키(m)²
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				System.out.println("신장을 입력하세요");
				int height = sc.nextInt();
				
				System.out.println("체중을 입력하세요");
				int weight = sc.nextInt();
				sc.close();
				
				//계산
				float heightM = (float) height / 100;
				float bmi = (float) weight / ( heightM * heightM );
				//
				
				//출력
				if(bmi > 24.5f) {
				System.out.println("BMI지수가" + bmi +"로 비만");
	}
				else {
					System.out.println("BMI지수가" + bmi +"로 정상");
				}
}
}
