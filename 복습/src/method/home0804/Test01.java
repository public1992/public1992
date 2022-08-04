package method.home0804;

public class Test01 {
	public static void main(String[] args) {
		
		//준비
		Melo a=new Melo();
		Melo b=new Melo();
		Melo c=new Melo();
		Melo d=new Melo();
		
		//계산
		a.set("그때 그 순간 그대로(그그그)", "WSG워너비", "WSG워너비 1집", 104250, 91835);
		b.set("보고싶었어", "WSG워너비", "WSG워너비 1집", 83127, 90805);
		c.set("LOVE DIVE", "IVE(아이브)", "LOVE DIVE", 64590, 174519);
		d.set("POP!", "나연(TWICE)", "IM NAYEON", 58826, 70313);
		
		//출력
		a.print();
		b.print();
		c.print();
		d.print();
	}
}