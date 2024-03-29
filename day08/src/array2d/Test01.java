package array2d;
public class Test01 {
	public static void main(String[] args) {
		//차원(Dimension)
		//ex : 3개 학교 3개 학년 5개 반 10명씩의 성적 정보
		//- 0차원(변수)으로 생각하면 변수가 450개 필요하다. -학생별
		//- 1차원으로 생각하면 1차원 배열이 45개 필요하다.(각 배열은 10칸 ) -반별
		//- 2차원으로 생각하면 2차원 배열이 9개 필요하다.(각 배열은 1차원배열 5개로 구성 ) -학년별
		//- 3차원으로 생각하면 3차원의 배열이 3개 필요하다. (각 배열은 2차원배열 3개로 구성 ) -학교별
		//- 4차원으로 생각하면 4차원 배열이 1개 필요하다. (3차원 배열 3개로 구성 ) - 전체

	//한반의 정보를 저장할 수 있는 배열(1차원)
		int[] a = new int[10];
		
		//한 학년의 정보를 저장할 수 있는 배열(2차원)
		int[][] b = new int[5][10];
		
		//한 학교의 정보를 저장할 수 있는 배열(3차원)
		int[][][] c = new int[3][5][10];
		
		//전체 정보를 저장할 수 있는 배열(4차원)
		int[][][][] d = new int[3][3][5][10];
		
		System.out.println(a.length); //10
		System.out.println(b.length); //5
		System.out.println(c.length); //3
		System.out.println(d.length); //3
		
	}
}
