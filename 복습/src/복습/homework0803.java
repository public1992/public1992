package 복습;
import java.util.*;
public class homework0803 {
	public static void main(String[] args) {
		
//		다음 규칙에 따라 지뢰찾기를 만드세요
//
//		9x9 크기의 정수 배열을 준비합니다
//		지뢰는 9로 표시하며, 배열 내에 무작위로 20개가 배치됩니다
//		배치된 이후 전체 지도를 출력하세요
		
		//준비: 정수배열, 지뢰개수
		int line=9;
		int room=9;
		int[][] landMine=new int[line][room];
		int mineN=20;
		
		//계산
		//중복걸러내기유의
		Random rnd=new Random();
		for(int i=0;i<mineN;i++) {
			//2차원, 1차원 배열 인덱스가 각각 랜덤으로 필요
			int mineline=rnd.nextInt(line);
			int mineroom=rnd.nextInt(room);
				if(landMine[mineline][mineroom]==0) {//아직데이터가안들어간공간일때
					landMine[mineline][mineroom]=9;
				}
				else {
					i--; //실행횟수<20이 되기전까지는 반복문이 안끝난다는점을이용해 내 맘에안드는결과가나오면 시행횟수에 하나를 깎아서 원하는결과가나올때까지돌아감. 반복문에서 사용가능.
				}
		}
		
		//출력
		for(int y=0;y<line;y++) {
			for(int x=0;x<room;x++) {
				System.out.print(landMine[y][x]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}
		
	}
