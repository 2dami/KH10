package array;
public class Test13 {
public static void main(String[] args) {
	
	int[] data = new int[] {30, 50, 20,10, 40};
	
	//계산(정렬)
	for(int i =data.length - 2; i >=0; i--) {
		for(int k=0; k <= i; k++) {
			//System.out.println(data[k] +"," +data[k+1]);
			if(data[k] > data[k+1]) {
				int backup = data[k];
				data[k] = data[k+1];
				data[k+1] = backup;
			}		
		}
	}
	//출력
	for(int i=0; i < data.length; i++) {
		System.out.println(data[i]);
	}
}
}
