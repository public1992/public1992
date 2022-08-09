package method.home0809;

public class Fighter extends Character {

	public Fighter(String id, int level) {
		super(id, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("전사가 뛰어서 이동합니다!");
	}
	
	

}
