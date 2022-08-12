package api.exception;

import java.util.*;
import java.util.regex.Pattern;

public class Test01 extends Tryin {
	public static void main(String[] args) {

		// 사용자가 입력하는 정보: 이름, 국어점수, 수학점수, 영어점수
		// 프로그램의 기능: 총점 구하기, 평균 구하기
		// 사용자가 입력을 잘못할 경우 "잘못된 입력입니다. 처음부터 다시 진행해주세요." 출력 후 프로그램 종료
		// 올바른 입력의 조건
		// 이름 한글로 2글자 이상 7글자 이하
		// 점수는 모두 0점 이상 100점 이하의 정수
		// 올바르게 입력했을 경우 이름, 총점, 평균을 출력
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 이름을 입력하세요: ");
		String name = sc.next();
		// 입력이 안될때마다 바로바로 종료해야 되니까 순서가 지금까지랑은 좀 다른듯
		String nameRex = "^[가-힣]{2,7}$";// 이름 한글 2~7자 검증
		boolean nameCheck = Pattern.matches(nameRex, name);
		stCheck(nameRex,name,nameCheck);

		System.out.println("사용자의 국어 점수를 입력하세요: ");
		int korean = sc.nextInt();
		boolean koreanCheck = korean >= 0 && korean <= 100;
		stCheck(korean, koreanCheck);

		System.out.println("사용자의 수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		boolean mathCheck = math >= 0 && math <= 100;
		stCheck(math, mathCheck);

		System.out.println("사용자의 영어 점수를 입력하세요: ");
		int english = sc.nextInt();
		boolean englishCheck = english >= 0 && english <= 100;
		stCheck(english, englishCheck);
		
		
		sc.close();

		int total = korean + english + math;
		float average = total / 3.0f;

		System.out.println("<사용자 정보>");
		System.out.println("이름: " + name);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.1f", average);

	}
}
