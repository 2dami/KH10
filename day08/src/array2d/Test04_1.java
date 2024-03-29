package array2d;

import java.util.Scanner;

//Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성하고 초기화는 세로 방향으로 하세요
// 줄 수 : 3 / 칸 수 : 4
public class Test04_1 {
public static void main(String[] args) {
	
	//준비
	Scanner sc = new Scanner(System.in);
	System.out.print("줄 수: ");
			int row = sc.nextInt();
			System.out.print("칸 수: ");
			int col = sc.nextInt();
			sc.close();
			
			int[][] arr = new int[row][col];
			//arr.length는 row와 같다
			//arr[?].length는 col과 같다
			
			//계산
			//- 값 기준
			//1→2→3→...→12(row*col)
			int x = 0;
			int y = 0;
			for(int i=1; i <= row*col; i++) {
				//System.out.println(i+" → ("+x+", "+y+")");
				arr[x][y] = i;
				
				if(x < row-1) {//마지막 줄이 아니라면
					x++;//다음줄
				}
				else {//마지막 줄이라면
					//다음 칸 첫번째 줄로 이동
					y++;
					x = 0;
				}
			}
			
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