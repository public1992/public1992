package method.home0809;

public class Magician extends Character{

	public Magician(String id, int level) {
		super(id, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("마법사가 날아서 이동합니다!");
	}

}
