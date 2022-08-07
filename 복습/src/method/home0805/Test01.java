package method.home0805;

public class Test01 {
	public static void main(String[] args) {
		
		//생성(준비)
		Police a=new Police("포돌이", "순경", "영등포경찰서");
		Police b=new Police("포순이", "경장", "당산파출소");
		Police c=new Police("포그리", "순경","마포경찰서");
		
		//포돌이 2발 포순이 1발 포그리 3발(계산)
		
		a.shoot();
		a.shoot();
	
		b.shoot();
		
		c.shoot();
		c.shoot();
		c.shoot();
		
		
		//결과(출력)
		
		a.print();
		b.print();
		c.print();
		
		
		
		
	}
	
}
