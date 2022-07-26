package 복습;

import java.lang.*;

public class Ruminate0726 {
	public static void main(String[] args) {

		// 정수와 실수를 사용한 계산
		// 0.75확률로 픽업 중인 키타산 블랙을 단챠로 10번 도전해서 얻을 확률

		// 변수 준비
		double nokitasan = 0.75;
		int gacha = 10;

		// 계산
		double getcha = Math.pow(nokitasan, gacha);

		// 출력
		System.out.println(getcha);

		// 정수와 실수의 데이터타입 변환 및 비교
		// 정수형(크기): byte(1) short(2) int(4) long(8)
		// 실수형(크기): float(4) double(8)

		// 규칙 1. 작은 형태의 데이터타입은 큰 형태의 데이터타입으로 변환할 수 있다.

		int a = 10;
		long b = a; // int(4바이트)->long(8바이트) 자동변환(묵시적 형변환)

		// 규칙 2. 큰 형태의 데이터타입은 작은 형태의 데이터타입으로 변환할 수 "없다"

		long c = 30;
		// int d=c; 라고 입력하면 30이 int에 충분히 들어가는 숫자임에도 불구하고 에러
		// 하지만 때려죽여도 난 이걸 해야겠다 하면...

		int d = (int) c;
		System.out.println(d); // 보무도 당당하게 강제변환(명시적 형변환) 등장

		// 규칙 3. 실수는 정수보다 크다
		long e = 10L;
		float f = e;

		// long변수를 float로 변환할 수 있다. 하지만 실수 float는 정수 long으로 변환할 수 없다.

		// 서열정리: byte(1)<short(2)<int(4)<float(4)<long(8)<double(8)

		// 연산자
		int kkkk = 10; // 이라고 적었을 때, 이것은 kkkk와 10은 같다는 뜻이 아니라
						// kkkk라는 좌측 저장소에 10이라는 우측 값을 저장한다는 뜻.

		// / 와 % 의 사용
		// 정수는 어떻게 계산해도 그 값이 정수만 나온다.
		// : /는 몫을 계산하는 연산자이다. ex 10/3=3
		// : %는 나머지를 계산하는 연산자이다. ex 10%3=1

		// 오늘자 환율로 일본 서버 (게임이름) 에서 10연차 한 번을 돌리면 원화 33,750원이 빠진다.
		// 내 통장에 90만원이 있다고 가정하면 10연차를 몇 번 돌릴 수 있는가?

		int gacha10 = 33750;
		int bankbook = 900000;

		int blackcow = bankbook / gacha10;
		System.out.println(blackcow); // 90만 나누기 33750의 값은 26.66666667이지만
													// 몫을 계산하는 연산자를 썼으므로 정수 26이 출력된다.
		
		
		//변수의 작명
		//대소문자를 구분하고, 길이에 제한이 없다.
		//예약어를 사용할 수 없다. int lovelove=888; 은 성립해도 int void=2;는 안 된다.
		//숫자로 시작해서는 안 된다. gacha10(됨) 10gacha(안됨)
		//특수문자는 _ 와 $만 허용한다.
		
		int gacha_20=100;
		//int gacha!20=2000;이라고 쓰면 에러남
		

	}
}
