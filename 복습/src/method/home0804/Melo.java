package method.home0804;

public class Melo {
	//필드멤버선언
		String songT;
		String name;
		String albumT;
		int playN;
		int likeN;
		
		//설정메소드
		void set(String songT, String name, String albumT, int playN, int likeN) {
			this.songT=songT;
			this.name=name;
			this.albumT=albumT;
			this.playN=playN;
			this.likeN=likeN;
		}
		
		//출력메소드
		void print() {
			double rankP=(playN*2+likeN)/2.0;
			if(playN>=100000&&likeN>=100000) {
					System.out.println("제목: "+songT+"*베스트*"+"*인기곡*");
					System.out.println("가수: "+name);
					System.out.println("앨범: "+albumT);
					System.out.println("재생 수: "+playN);
					System.out.println("좋아요 수: "+likeN);
					System.out.println("랭킹 점수: "+rankP);
				}
				if(playN>=100000&&likeN<100000) {
					System.out.println("제목: "+songT+"*베스트*");
					System.out.println("가수: "+name);
					System.out.println("앨범: "+albumT);
					System.out.println("재생 수: "+playN);
					System.out.println("좋아요 수: "+likeN);
					System.out.println("랭킹 점수: "+rankP);		
				}
				
			if(playN<100000&&likeN>=100000) {
					System.out.println("제목: "+songT+"*인기곡*");
					System.out.println("가수: "+name);
					System.out.println("앨범: "+albumT);
					System.out.println("재생 수: "+playN);
					System.out.println("좋아요 수: "+likeN);
					System.out.println("랭킹 점수: "+rankP);						
				}
				if(playN<100000&&likeN<100000) {
					System.out.println("제목: "+songT);
					System.out.println("가수: "+name);
					System.out.println("앨범: "+albumT);
					System.out.println("재생 수: "+playN);
					System.out.println("좋아요 수: "+likeN);
					System.out.println("랭킹 점수: "+rankP);		
					
				}
			System.out.println("-----------------");
	
		}
}
