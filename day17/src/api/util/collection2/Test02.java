package api.util.collection2;

import java.util.TreeSet;
import java.util.Random;
import java.util.Set;

//로또 번호 추첨문제를 Set으로 풀어보세요
public class Test02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		Set<Integer> lotto =  new TreeSet<>();
		
		while(lotto.size() < 6) {
			int number =r.nextInt(45) + 1;
			lotto.add(number);
			}
		System.out.println(lotto);
	}
		}
