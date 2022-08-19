package oop.inner1;
//중첩 클래스
//-클래스 간의 소유관계를 표현
//-


//종류
//- 일반 중첩 클래스(*)
//- static 중첩 클래스(*)
//- 지역 중첩 클래스(x)
//- 익명 중첩 클래스(********)
public class Police {
	private Gun gun;

	public Police() {
		this.gun = new Gun();
	}
	
	//private class Gun {}//일반 중첩 클래스
	private static class Gun {} // static 중첩 클래스
	
	public void print() {
		class Gun{} //지역 중첩 클래스(메소드 내부에서만 사용가능)
}
}
