package api.home0811;
import java.util.*;
import java.util.regex.Pattern;
public class Test02 {
	public static void main(String[] args) {
//		아이디의 첫 글자는 알파벳 소문자로 시작해야 한다
//		아이디의 두 번째 글자부터는 숫자 혹은 알파벳 소문자로 작성되어야 한다
//		아이디는 총 8글자 이상 20글자 이하로 작성되어야 한다
		//준비
		Scanner sc=new Scanner(System.in);
		System.out.print("사용하실 ID를 입력해주세요: ");
		String id=sc.next();
		sc.close();
		//계산
		String idRule="^[a-z][a-z0-9]{7,19}$";
		boolean check=Pattern.matches(idRule, id);
		boolean number=id.length()>=8&&id.length()<=20;
		//출력
		if(check&&number==true) {
			System.out.println("입력하신 ID는 사용할 수 있습니다");
		}
		else {
			System.out.println("입력하신 ID는 사용할 수 없습니다. 다시 입력해주세요");
		}
	}

}
