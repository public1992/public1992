package home_0816;
import java.util.*;
import java.text.*;
public class Test01 {
	public static void main(String[] args) {
//		사용자에게 연, 월을 입력받아서
//		해당하는 달의 달력을 보여주세요.

		//준비: 연, 월 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("연도를 입력해주세요: ");
		int year=sc.nextInt();
		System.out.println("월수를 입력해주세요: ");
		int month=sc.nextInt();
		sc.close();
		
		//준비: 입력받은 숫자로 연도/월 바꾸기
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(year, month-1,1);//컴퓨터는 1~12가 아니라 0~11
		
		int startWeek=c.get(Calendar.DAY_OF_WEEK);
		boolean sunday=startWeek==0;
	
		//System.out.println(startWeek); 확인

		System.out.printf("%d년 %d월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println(Calendar.DATE);
		if(sunday==false) {
			c.add(Calendar.DATE,-(startWeek-1));
		}
		int count=0;
		for(int i=0;i<42;i++) {
			System.out.print(c.get(c.DATE));
			System.out.print("\t");
			c.add(c.DATE, 1);
			count++;
			if(count%7==0) {
				System.out.println();
			}
			
		}
		
		
	}
}
