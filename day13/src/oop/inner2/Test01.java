package oop.inner2;

public class Test01 {
	private static Button menu;

	public static void main(String[] args) {
		Button bt1 = new Button();
		bt1.push();
		// -
		//-일회용 상속 효과가 발생한다.
	 Button menu = new Button() {
			public void push() {
				System.out.println("메뉴 버튼 클릭");
			}
		};
		menu.push();
	}
}
