package array2d;
import java.util.Random;

//다음 규칙에 따라 빙고판을 만드세요
//- 5x5 크기의 정수 배열을 준비
//- 1부터 25까지의 숫자를 무작위 위치에 배치
//- 한 칸에는 한 번만 값을 배치할 수 있습니다
//- 크기가 달라질 경우에도 달라진 크기에 맞게 빙고판이 만들어져야 합니다
public class Test06_1 {
public static void main(String[] args) {
	//준비
	int size = 5;
	
	int[][] map = new int[size][size];
	//map.length 와 map[?].length가 모두 size와 같다.
	
	//계산
	Random r = new Random();
	for(int i=1; i <= size*size; i++) {
		int x = r.nextInt(size);
				int y = r.nextInt(size);
				//System.out.println("i ="+i+", x ="+x+", y ="+y);
				
				//if(데이터가 들어간적이 없는 칸이라면) {
				if(map[x][y] ==0) {
				map[x][y] = i;
	}
				else {
					//다시 뽑아
					i--;
				}
	}
	//출력
	for(int i=0; i < size; i++) {
		for(int k=0; k < size; k++) {
			System.out.print(map[i][k]);
			System.out.print("\t");
		}
		System.out.println();
		System.out.println();
	}
	
}
}