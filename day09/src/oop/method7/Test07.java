package oop.method7;

public class Test07 {
	public static void main(String[] args) {
		Chart p1 = new Chart();
		Chart p2 = new Chart();
		Chart p3 = new Chart();
		Chart p4 = new Chart();
		
		p1.setting("그때 그 순간 그대로","WSG워너비","WSG워너비 1집",
				104250,91835);
		p2.setting("보고싶었어","WSG워너비","WSG워너비 1집",83127,
				90805);
		p3.setting("LOVE DIVE","IVE(아이브)","LOVE DIVE",64590,
				174519);
		p4.setting("POP!","나연(TWICE)","IM NAYEON",58826,
				70313);

		p1.print();
		p2.print();
		p3.print();
		p4.print();
		
		}
	}
