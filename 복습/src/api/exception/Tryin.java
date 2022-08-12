package api.exception;

import java.util.regex.Pattern;

public class Tryin {
	public static String rexReg;
	public static String inheritName;
	public static int score;
	public static boolean scarecrow;
	
	
	public boolean isScarecrow() {
		return scarecrow;
	}


	public void setScarecrow(boolean scarecrow) {
		this.scarecrow = scarecrow;
	}


	//오버로딩으로 아예 검증까지 포함해서 더 줄일순없을까??? string이랑 int니까 될거같은데???
	
	public static void stCheck(String rexReg, String inheritName, boolean scarecrow) {
		scarecrow=Pattern.matches(rexReg, inheritName);
		if(scarecrow==false) {
			System.out.println("잘못된 입력입니다. 처음부터 다시 진행해주세요.");
			System.exit(0);
		}
	}
	
	public static void stCheck(int score, boolean scarecrow) {
		scarecrow=score>=0&&score<=100;
		if(scarecrow==false) {
			System.out.println("잘못된 입력입니다. 처음부터 다시 진행해주세요.");
			System.exit(0);
		}
}
}
