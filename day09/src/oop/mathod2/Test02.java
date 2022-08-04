package oop.mathod2;

public class Test02 {
	public static void main(String[] args) {
		
	Player a = new Player();
	a.setting("진종오" , "사격" , "하계" , 4 , 2 , 0);
	a.print();
	
	Player b = new Player();
	b.setting("김수녕" , "양궁" , "하계" , 4 , 1 , 1);
	b.print();
	
	Player c = new Player();
	c.setting("전이경" , "쇼트트랙" , "동계" , 4 , 0 , 1);
	c.print();
	}
}
