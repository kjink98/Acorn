// 2���� �迭�� �̿��� ����ǥ


public class Sungjuk_v2{
	public static void main(String[] args){
		String[] names = {"ȫ�浿", "�Ӳ���", "�ŵ���"};
		char[] grade = new char[3];
		int[][] sungjuk = {
			{1, 98, 90, 0, 0, 0}, // �й�, ����, ����, ����, ���, ���
			{2, 76, 55, 0, 0, 0},
			{3, 85, 73, 0, 0, 0}
		};
		
		// ���� ���ϱ�
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
			
		}
		
		// ��� ���ϱ�
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][4] = sungjuk[i][3] / 2;
			
		}
		
		// ���� ���ϱ�
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
		// ��� ���ϱ�
		

		// ���
		
		System.out.println("***���� ���***");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i]);
				
			
		}
		
		
		
		// ���� �� ���
		
		
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
				} // if ����
			} // for(j) ����
		} // for(i) ����
		
		System.out.println("***���� ���***");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			
			System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" + grade[i]);
				
			
		}
		
		
	}
}