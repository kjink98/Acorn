// 1���� �迭�� �̿��� ����ǥ


public class Sungjuk_v1{
	
	public static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j+1];
		a[j+1] = temp;
	}
	public static void main(String[] args){
		String[] names = {"ȫ�浿", "�Ӳ���", "�ŵ���"};
		int[] no = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};
		int[] tot = new int[3];
		int[] avg = new int[3];
		char[] grade = new char[3];
		int[] rank = new int[3];
		
		// ���� ���ϱ�
		for(int i=0; i<no.length; i++){
			tot[i] = kor[i] + eng[i];
		}
		
		// ��� ���ϱ�
		for(int i=0; i<no.length; i++){
			avg[i] = (kor[i] + eng[i]) / 2;
		}
		
		// ���� ���ϱ�
		for(int i = 0; i<no.length; i++){
			switch(avg[i]/10){
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
		// ��� ���ϱ�
		for(int i = 0; i<avg.length; i++){
			int cnt = 1;
			for(int j = 0; j<avg.length; j++){
				if(avg[i] < avg[j]) cnt++;
			}
			rank[i] = cnt;
		}
	
		
		
		// ���
		
		System.out.println("***���� ���***");
		System.out.println("�й�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
		
		// ���� �� ���
		
		for(int i=0; i<avg.length-1; i++){
			for(int j=i; j<avg.length-1; j++){
				if(avg[i] > avg[j+1])
					swap(avg, i, j);
			}
		}
		
		for(int i=0; i<no.length; i++){
			System.out.print(avg[i] + "\t");
		}
		
	}
}