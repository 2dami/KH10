package exception;

public class Test07 {
	public static void main(String[] args) {
		try{
		Student s = new  Student ("피카츄", 50,60,70);
		s.setName("라이츄");
				System.out.println(s.toString());
	}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		}
}
