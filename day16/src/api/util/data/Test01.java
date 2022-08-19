package api.util.data;

import java.util.Date;

public class Test01 {
public static void main(String[] args) {
	// 시간 다루기
	Date a = new Date();
	Date b = new Date(2022,8,16);
	Date c = new Date(22,8,16);
	
	System.out.println("a =" + a); //a =Tue Aug 16 11:51:55 KST 2022
	System.out.println("b =" + b); //b =Sat Sep 16 00:00:00 KST 3922
	System.out.println("c =" + c); //c =Sat Sep 16 00:00:00 KST 1922
	
}
}
