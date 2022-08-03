package array2d;

import java.util.Scanner;

//사용자에게 줄 수와 칸 수를 입력받아 해당하는 크기만큼의 2차원 배열을 생성
//좌측 상단에 1부터 채워넣어 끝까지 1씩 증가하며 숫자가 채워지도록 구현
//구현 후 배열을 출력
public class Test03 {
public static void main(String[] args) {

	//준비
			int row = 3;
			int col = 4;
			
			int[][] arr = new int[row][col];
			//arr.length는 row와 같다
			//arr[?].length는 col과 같다
			
			//계산
			
			//출력
			for(int i=0; i < arr.length; i++) {
				for(int k=0; k < arr[i].length; k++) {
					System.out.print(arr[i][k]);
					System.out.print("\t");
				}
				System.out.println();
			}
		}
	}