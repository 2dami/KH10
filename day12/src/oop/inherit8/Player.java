package oop.inherit8;

public abstract class Player {
	protected String id;
	protected int level;
	
	public abstract void attack();
	public abstract void move();
	public final void print() {
		System.out.println("<플레이어 정보>");
		System.out.println("아이디:" + this.id);
		System.out.println("레벨:" + this.level);
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void levelUp() {
		this.level++;
	}
	public Player(String id) {
		this(id,1);
	}
	public Player(String id,int level) {
		this.setId(id);
	}

}
