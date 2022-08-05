package oop.setter2;

public class Academy {
	String name;
	int time;
	int price;
	String type;
	
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
		//[1번 방법] if(time> 0 && time %30 ==0) {
		//		this.time = time;
	if(time < 0) {
		 return;
	}
	 if(time %30 !=0) {
		 return;
		}
	 this.time = time;
	}
		void setPrice(int price) {
			if(price < 0) {
				return;
			}
			this.price = price;
	}
		// tip : 문자열은 비교 연산이 힘들다 (안 될 경우가 존재)
		void setType(String type) {
			switch(type) {
			case"온라인":
			case"오프라인":
			case"혼합":
			}
		this.type =type;
		}
		void print() {
			System.out.println(this.name);
			System.out.println(this.time);
			System.out.println(this.price);
			System.out.println(this.type);
			System.out.println("\t");
		}
		Academy(String name, int time, int price, String type){
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
}

