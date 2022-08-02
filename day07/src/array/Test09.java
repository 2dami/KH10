package array;
import java.util.Scanner;
//사용자에게 숫자 5개를 입력받아 배열에 저장
//입력받은 모든 숫자를 출력
//입력받은 모든 숫자의 합계와 평균을 구하여 출력
public class Test09 {
	public static void main(String[] args) {
		
		//배열 준비
		int[] data = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			System.out.println("숫자를 입력하세요:");
			data[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < data.length; i++) {
		System.out.println("입력숫자 = " + data[i]);
		}
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			total +=data[i];
		}
		System.out.println(" 합계 = " + total );
		}
	}
