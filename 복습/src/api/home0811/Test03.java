package api.home0811;
import java.util.*;
import java.util.regex.Pattern;
public class Test03 {
public static void main(String[] args) {
//	닉네임은 한글 또는 숫자로만 작성되어야 한다
//	닉네임은 2글자 이상 10글자 이하로 작성되어야 한다
//	ㅋㅋㅋ, ㅡㅡ와 같은 자음 모음만 있는 경우는 불가능하다
	
	//준비: 스캐너, id입력
	Scanner sc=new Scanner(System.in);
	System.out.print("사용할 닉네임을 입력해주세요: ");
	String nickname=sc.next();
	sc.close();
	
	//계산: 패턴체크로 boolean,  .length로 boolean
	String rexCheck="^[0-9가-힣]{2,10}$";
	boolean patternCheck=Pattern.matches(rexCheck, nickname);
	boolean numberCheck=nickname.length()>=2&&nickname.length()<=10;
	if(patternCheck&&numberCheck==true) {
		System.out.println("입력하신 닉네임은 사용할 수 있습니다.");
	}
	else {
		System.out.println("입력하신 닉네임은 사용할 수 없습니다. 다시 입력해주세요");
	}
}
}
