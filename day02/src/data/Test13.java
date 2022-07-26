package data;
//KH주유소 휘발유는 1L에 1920원에 판매중
//50000원을 주유했을때 주유 가능한 리터(L)를 구하여 출력
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		
		//준비
		int money = 50000;
		int oilPricePerLitre = 1920;
		
		//계산
		//float litre = (float) money / oilPricePerLitre;
		double litre = (double) money / oilPricePerLitre;
	
		//출력
				System.out.println("주유 가능한 리터");
				System.out.println(litre);
}
}