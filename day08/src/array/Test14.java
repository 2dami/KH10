package array;
public class Test14 {
public static void main(String[] args) {
	//삽입 정렬 (insertion sort)
	//모든 자리의 값을 순차적으로 백업후 들어갈 자리를 만들어 삽입하는 정렬
	
	//준비
	int[] data = new int[] {30, 50, 20, 10, 40};
	
	//정렬
	int backup = data[2];
	int index = 2;
	
	for(int i=1; i >=0; i--) {
		System.out.println(index +"," + i);
	}
	//출력
	for(int i =0; i < data.length; i++) {
		System.out.println(data[i]);
	}
}
}
