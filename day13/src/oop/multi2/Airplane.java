package oop.multi2;

public class Airplane implements Transportation , Flyable, Reserve {
	
	
	@Override
	public void move() {
		System.out.println("Airplane이 이동합니다.");
		
	}
@Override
	public void fly() {
	System.out.println("Airplane이 비행합니다.");
		
	}
@Override
public void reservation() {
	System.out.println("Airplane을 예약합니다.");
	
}

}
