package odd.method3;

import oop.mathod2.Player;

public class Test03 {
public static void main(String[] args) {
	
	Student a = new Student();
	Student b = new Student();
	Student c = new Student();
	
	a.setting("피카츄" , 90 , 90 , 85 );
	b.setting ("라이츄" , 80 , 90 , 85 );
	c.setting("꼬부기" , 100 , 90 , 90 );
	
	a.print();
	b.print();
	c.print();
}
}
