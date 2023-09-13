// 클래스를 이용한 성적표
class Student{
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(String name, int no, int kor, int eng){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		
	}
}

public class Sungjuk_v3{
	public static void main(String[] args){
		Student[] st = new Student[3]; // 참조변수 생성 (객체 생성 X)
		st[0] = new Student("홍길동", 1, 98, 90); // 객체 생성
		st[1] = new Student("임꺽정", 2, 76, 55);
		st[2] = new Student("신돌석", 3, 85, 73);
		
		// 총점 구하기
		for(int i=0; i<st.length; i++){
			st[i].tot = st[i].kor + st[i].eng;
			
		}
		
		// 평균 구하기
		for(int i=0; i<st.length; i++){
			st[i].avg = st[i].tot / 2;
			
		}
		
		// 학점 구하기
		for(int i = 0; i<st.length; i++){
			switch(st[i].avg/10){
				case 9: st[i].grade='A';
				break;
				case 8: st[i].grade='B';
				break;
				case 7: st[i].grade='C';
				break;
				case 6: st[i].grade='D';
				break;
				default: st[i].grade='F';
				break;				
			}
		}
		// 등수 구하기
		

		// 출력
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t" + st[i].eng + "\t" + st[i].tot + "\t" + st[i].avg + "\t" + st[i].grade);
				
			
		}
		
		
		
		// 정렬 후 출력
		
		
		for(int i=0; i<st.length-1; i++){
			for(int j=i+1; j<st.length; j++){
				if(st[i].avg < st[j].avg){
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
					
				} // if 종료
			} // for(j) 종료
		} // for(i) 종료
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t" + st[i].eng + "\t" + st[i].tot + "\t" + st[i].avg + "\t" + st[i].grade);
				
			
		}
		
		
	}
}