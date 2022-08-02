package array;
// 배열 뒤집기 [ 30, 10, 20, 50, 40 -----> result : 40, 50, 20, 10, 30]
// 배열의 데이터를 순차적으로 출력 - 배열의 모든 데이터의 위치를 반대로 변경 - 변경된 데이터 순차적으로 출력
public class Test11 {
public static void main(String[] args) {
	
	int[] data = new int [] {30, 10, 20, 50, 40};
	
	for (int i = 0; i < data.length; i++) {
		System.out.println("data = " + data[i] );
	}
	int backup = data[0];
	data[0] = data[4];
	data[4] = backup;
	
	int backup2 = data[1];
	data[1] = data[3];
	data[3] = backup2;
	
	for(int i=0; i < data.length; i++) {
		System.out.println("data2 = " + data[i]);
	}	
}
}
