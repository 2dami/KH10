package oop.multi2;

public class Drone implements Electronic ,Transportation , Flyable {
	
	@Override
	public void on() {
		System.out.println("Drone이 켜짐.");
	}
		@Override
		public void off() {
			System.out.println("Drone이 꺼짐.");
		}
			@Override
	public void move() {
		System.out.println("Drone이 이동합니다.");
		
	}
@Override
	public void fly() {
	System.out.println("Drone이 비행합니다.");
		
	}
}
