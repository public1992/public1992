package method.home0809;

public class Elf extends Character{

	public Elf(String id, int level) {
		super(id, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("엘프가 활으로 공격합니다!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("엘프가 이동합니다!");
	}

}
