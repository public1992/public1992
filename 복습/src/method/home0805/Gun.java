package method.home0805;

public class Gun {
	
	//총알만
	private int bullet=2;
	
	public void setBullet(int bullet) {
		this.bullet=bullet;
	}
	public int getBullet() {
		return bullet;
	}
	
	//빠이야!
	public void fire() {
		if(bullet<=0) {//0발 이하
			System.out.println("딸깍");
		}
		else {//아직 총알 있음
			System.out.println("빵야!");
			bullet--;
		}
	}
	
	public void printG() {
		System.out.println("잔탄: "+this.bullet);
	}
	
	//생성자
	public Gun(int bullet){
		this.bullet=bullet;
	}
	
}
