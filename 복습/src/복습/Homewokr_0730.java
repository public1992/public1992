package 복습;

import java.util.Scanner;

public class Homewokr_0730 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1단과 9단 사이에서 원하는 단수를 고르세요!");
		int whatN=sc.nextInt();
		System.out.printf("%d단 시작!\n", whatN);
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = ?\n", whatN, i);
		}
		int correct=0;
		int wrong=0;
		//정답입력
		System.out.println("정답을 입력하세요!");
		for(int e=1;e<=9;e++) {
			int answer=sc.nextInt();
				if(answer%whatN==0) {
					correct++;
				}
				else {
					wrong++;
				}
			}
		sc.close();
		
		System.out.printf("게임 종료! 정답 %d개, 오답 %d개", correct, wrong);
	
	} 
}
