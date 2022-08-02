package loop;

//30일동안 첫 날은 1원만 주시고 둘째 날 부터는 두배를 주십시오
//(1) 한달동안 노인이 받게되는 금액을 일자별로 출력
//(2) 노인의 통장에 한달 뒤에 찍히는 금액을 출력
//(3) 40일이면 어떻게 되는지 출력 (40일차 금액 / 통장에 찍힌 금액)
public class Test13 {
public static void main(String[] args) {
	
	int money = 1;
	int total = 0;
	
	for(int day=1; day <=30; day++) {
		System.out.println(day +"일차 -" + money +"원");
		total += money;
		money *= 2; //money + = money
	}
	System.out.println( "한달 뒤 찍히는 금액 : " + total );
	
}
}
