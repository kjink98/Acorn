// 2차원 배열을 이용한 성적표


public class Sungjuk_v2{
	public static void main(String[] args){
		String[] names = {"홍길동", "임꺽정", "신돌석"};
		char[] grade = new char[3];
		int[][] sungjuk = {
			{1, 98, 90, 0, 0, 0}, // 학번, 국어, 영어, 총점, 평균, 등수
			{2, 76, 55, 0, 0, 0},
			{3, 85, 73, 0, 0, 0}
		};
		
		// 총점 구하기
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
			
		}
		
		// 평균 구하기
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][4] = sungjuk[i][3] / 2;
			
		}
		
		// 학점 구하기
		for(int i = 0; i<sungjuk.length; i++){
			switch(sungjuk[i][4]/10){
				case 9: grade[i]='A';
				break;
				case 8: grade[i]='B';
				break;
				case 7: grade[i]='C';
				break;
				case 6: grade[i]='D';
				break;
				default: grade[i]='F';
				break;				
			}
		}
		// 등수 구하기
		

		// 출력
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i]);
				
			
		}
		
		
		
		// 정렬 후 출력
		
		
		for(int i=0; i<sungjuk.length-1; i++){
			for(int j=i+1; j<sungjuk.length; j++){
				if(sungjuk[i][4] < sungjuk[j][4]){
					int[] rowTemp = sungjuk[i];
					sungjuk[i] = sungjuk[j];
					sungjuk[j] = rowTemp;
					
					char ctemp = grade[i];
					grade[i] = grade[j];
					grade[j] = ctemp;
					
					String stemp = names[i];
					names[i] = names[j];
					names[j] = stemp;
				} // if 종료
			} // for(j) 종료
		} // for(i) 종료
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i]);
				
			
		}
		
		
	}
}