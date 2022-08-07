package method.home0805;

public class Police {

	//필드
	String name;
	String position;
	String workplace;

	
	//게터, 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	//shoot 메소드=fire실행 메소드

	Gun m=new Gun(2);
	
	public void shoot() {
		m.fire();
	}
	
	//출력메소드
	
	public void print() {
		System.out.println("이름: "+this.name);
		System.out.println("직급: "+this.position);
		System.out.println("근무지: "+this.workplace);
		m.printG();
		System.out.println();
	}
	
	//생성자
	public Police(String name, String position, String workplace){
		this.setName(name);
		this.setPosition(position);
		this.setWorkplace(workplace);
	}
	
	
}
