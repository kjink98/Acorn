// Ŭ������ �̿��� ����ǥ
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
		Student[] st = new Student[3]; // �������� ���� (��ü ���� X)
		st[0] = new Student("ȫ�浿", 1, 98, 90); // ��ü ����
		st[1] = new Student("�Ӳ���", 2, 76, 55);
		st[2] = new Student("�ŵ���", 3, 85, 73);
		
		// ���� ���ϱ�
		for(int i=0; i<st.length; i++){
			st[i].tot = st[i].kor + st[i].eng;
			
		}
		
		// ��� ���ϱ�
		for(int i=0; i<st.length; i++){
			st[i].avg = st[i].tot / 2;
			
		}
		
		// ���� ���ϱ�
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
		// ��� ���ϱ�
		

		// ���
		
		System.out.println("***���� ���***");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t" + st[i].eng + "\t" + st[i].tot + "\t" + st[i].avg + "\t" + st[i].grade);
				
			
		}
		
		
		
		// ���� �� ���
		
		
		for(int i=0; i<st.length-1; i++){
			for(int j=i+1; j<st.length; j++){
				if(st[i].avg < st[j].avg){
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
					
				} // if ����
			} // for(j) ����
		} // for(i) ����
		
		System.out.println("***���� ���***");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i].no + "\t" + st[i].name + "\t" + st[i].kor + "\t" + st[i].eng + "\t" + st[i].tot + "\t" + st[i].avg + "\t" + st[i].grade);
				
			
		}
		
		
	}
}