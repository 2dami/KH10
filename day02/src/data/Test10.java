package data;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		//실수의 종류와 특징
		//실수는 소수점이 있는 숫자
		
		//- float - 2^32 (4byte,32bit)
		//- double - 기본값,2^64 (8byte,64bit)
		
		float a = 1.5f;
		double b = 1.5;
		
		System.out.println(a); //1.5
		System.out.println(b); //1.5
		
		// 1.실수는 부정확하다
		float c = 1.23491120487180375013857013857f;
		System.out.println(c); //1.2349112
		double d = 1.23491120487180375013857013857;
		System.out.println(d); //1.2349112048718038
		
		// 2. 실수가 하나라도 포함된 계산은 결과가 실수가 나온다
		System.out.println(10 / 3); // 정수-정수[ 3]
		System.out.println(10 / 3.0); // 정수-실수 [ 3.3333333333333335 ]
		System.out.println(10 / 3f); // 정수-실수 [ 3.3333333 ]
		System.out.println(10 / 3d); // 정수-실수 [ 3.3333333333333335 ]
		
	}
}
