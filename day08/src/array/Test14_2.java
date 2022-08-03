package array;
public class Test14_2 {
public static void main(String[] args) {
	//삽입 정렬 (insertion sort)
	//모든 자리의 값을 순차적으로 백업후 들어갈 자리를 만들어 삽입하는 정렬
	
	//준비
	int[] data = new int[] {30, 50, 20, 10, 40};
	
	//---------3번위치의 "10"을 백업하여 자리변경 할 경우..
	//정렬
	int backup = data[3]; // data 2---> 3으로 변경
	int index = 3; //data 2---> 3으로 변경
	
	for(int i=2; i >=0; i--) { // i =1---> 2로 변경
		if(backup < data[i]) {
			data[i+1] = data[i]; //한칸 우측으로 복사
			index--; //들어갈 위치를 한칸 왼쪽으로 조정
		}
		else {
			break;
		}
	}
	//System.out.println("index=" + index );
	data[index] = backup;
	
	//출력
	for(int i =0; i < data.length; i++) {
		System.out.println(data[i]);
	}
}
}
