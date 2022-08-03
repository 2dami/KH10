package array2d;
//Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성하고 초기화는 대각선 방향으로 하세요
//줄 수 : 3 / 칸 수 : 4
public class Test05 {
public static void main(String[] args) {
	//준비
	int row = 3;
	int col = 4;
	
	int[][] arr = new int[row][col];
	
	//계산
	// - x의 위치와 y 위치의 합계가 0부터 5까지인 경우를 찾아서 대입(벗어나는 경우 빼고)
	int n =1;
	for(int i=0; i <= (row-1) +(col-1); i++) {
		//System.out.println("합계: " + i);
		for (int k=i; k >= 0; k--) {
	// if(줄이 범위를 벗어나지 않으면서 칸이 범위를 벗어나지 않는다면)
			if(k< row && (i-k) < col) { //if(k<= 2 && (i-k) <= 3) [(k=0,1,2 && (i-k) ==0,1,2,3)]
			//System.out.println("( " + k +", " +(i-k) +")");
				arr[k][i-k] = n++;
		}
	}
}
}
}