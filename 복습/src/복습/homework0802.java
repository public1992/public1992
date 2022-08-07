package 복습;

public class homework0802 {
	public static void main(String[] args) {
//		다음 규칙에 따라 정렬을 구현하세요.
//
//		30, 10, 20, 50, 40을 저장할 배열을 만듭니다.
//		배열의 위치를 변경하여 10, 20, 30, 40, 50 순으로 저장될 수 있도록 만든 뒤 출력합니다
		//		배열에서 가장 작은 값을 찾아 가장 왼쪽에 있는 데이터와 교체합니다
		//		교체된 데이터의 위치는 제외하고 나머지 위치에서 가장 작은 값을 찾아 좌측 데이터와 교체합니다
		//		데이터가 완전히 정렬될 때까지 반복합니다
		
		//한 턴씩 구현해가면서풀어야함
		int[] data= {30,50,20,10,40};
		
		//1턴: 전체 배열에서 가장 작은 숫자의 위치를 찾아 맨 앞의 데이터와 교체
		
		//가장 작은 숫자의 위치를 찾음
		int min=0;
		for(int i=1;i<4;i++) {
			if(data[min]>data[i]/*더 작은 값을 발견하면*/) {
				min=i;
			}
		}
		System.out.println("min= "+min);
		
		//맨 앞이랑 교체
		int backup=data[0];
		data[0]=data[min];
		data[min]=backup;
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		//2nd phase

		int min2nd=1;//맨앞자리는 없는걸로치고 남은 4개중 제일 작은 숫자가 1번 자리에 있다고 가정
		for(int i=2/*1번을 잡고 걔랑 비교하는거니까 2부터시작*/; i<4;i++) {
			if(data[min2nd]>data[i]) {
				min2nd=i;
			}
		}
		System.out.println("min2nd= "+min2nd);//20이 저장되어있는 data[2]자리값이 나옴
		
		//2번 자리 값을 1번 자리 값과 교체
		int backup2=data[1];
		data[1]=data[min2nd];
		data[min2nd]=backup2;
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		//서드페이즈
		int min3rd=2;
		for(int i=3;i<4;i++) {
			if(data[min3rd]>data[i]) {
			min3rd=i;
			}			
		}
		System.out.println("min3rd= "+min3rd);
		
		int backup3=data[2];
		data[2]=data[min3rd];
		data[min3rd]=backup3;
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		//이제 남은자리 두자리밖에없는데 의미가 있음?
		//근데 안하고 와~비교하자~하면 배열 수 바꿨을때 에러안남?
		//i=4 i<4면 이거 작동자체를안하는거아님???
		int min4th=3;
		boolean discern=data[min4th]>data[4];
		if(discern==true) {
			int backup4=data[min4th];
			data[min4th]=data[4];
			data[4]=backup4;
		}
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

	}

