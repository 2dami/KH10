package data;
import java.lang.*;
public class Test12 {
	public static void main(String[] args) {
//정수와 실수의 비교 및 변환
		//- 정수 : byte(1), short(2), int(4), long(8)
		//-실수 : float (4), double(8)
		
		//rbclr
		//1. 작은 형태의 데이터는 큰 형태의 데이터로 저장할 수 있다.
		//2. 큰 형태의 데이터는 작은형태의 데이터로 저장할 수 없다.
		//3. 실수는 정수보다 무조건 크다.
		
		int a = 10;
		long b = a;//int -> long (작-큰) 자동변환
		
		long c = 10L;
		//int d = c; // long -> int (큰-작) error
		int d = (int)c;// L -> I 강제변환
		
		long e = 10L;
		float f = e;// L -> F 자동변환
		
		float g = 1.5f;
		long h = (long)g;// f -> L 강제변환
				
}
}