package method.home0809;

public abstract class Character {
	
	//공용 필드
	protected String id;
	protected int level;
	
	//세터, 게터
	//레벨 최소 1이상(생성시 1, 저장시 1이상)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<=0) {
			return;
		}
		this.level = level;
	}
	
	
	//전부 내용이 다른 공격/이동 커맨드는 추상화 메소드로 선언
	public abstract void attack();
	public abstract void move();
	
	//정보출력기능은 셋 다 쓰니까 추상화아니어도될듯
	public void print() {
		System.out.println("캐릭터 정보");
		System.out.println("ID: "+this.id);
		System.out.println("LV: "+this.level);
	}
	
	//생성시 아이디'만' 설정가능하고 레벨은 1
	public Character(String id) {
		setId(id);
		setLevel(1);
	}
	
	//플레이해서 레벨이 오른 캐릭터를 저장할 때
	public Character(String id, int level) {
		setId(id);
		setLevel(level);
	}
	

}
