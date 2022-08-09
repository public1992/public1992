package method.home0809;

public class Test01 {
	public static void main(String[] args) {
		
		
		Fighter a=new Fighter("티나한",99);
		Magician b=new Magician("비형", 95);
		Elf c=new Elf("케이건", 102);
		
		a.print();
		a.attack();
		a.move();
		System.out.println("---------------");
		b.print();
		b.attack();
		b.move();
		System.out.println("---------------");
		c.print();
		c.attack();
		c.move();
		
		
	}
}
