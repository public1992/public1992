package 복습;
import java.util.Scanner;

public class Homework0728 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("연도");
		int year=sc.nextInt();
		System.out.println("월");
		int month=sc.nextInt();
		sc.close();
		
	
		String yearIdentity;
		int lastday;
		
		if(year%4==0||(year%4==0&&year%400==0)) {
			yearIdentity="윤년";
			}
		else {
			yearIdentity="평년";
			}
		
		switch(month) {
		case 2:
			switch(yearIdentity) {
			case "윤년":
				lastday=29;
				break;
			default:
				lastday=28;
				break;
			}
		case 4: case 6: case 9: case 10:
			lastday=30;
			break;
		default:
			lastday=31;
			break;
		}
		
		System.out.printf("%d년은 %s 이다. %d년 %d월은 %d일으로 끝난다.", year,yearIdentity,year,month,lastday);
				
				
			}
		}

		
		