public class ArrayTest3{
	public static void main(String[] args){
		int first[] = {1, 78, 65, 89};
		int second[] = new int[4];
		int third[] = new int[4];
		
		int arr[][] = new int[3][4];
		
		int [][]arr2 = {
			{1, 78, 65, 89},
			{2, 78, 65, 89},
			{3, 78, 65, 89},
		};
		
		System.out.println(first[0]);
		System.out.println(arr2[0][0]);
		
		// �ұ�Ģ �迭
		char[][] name = new char[2][6];
		name[0][0] = 'T';
		name[0][1] = 'o';
		name[0][2] = 'm';
		
		name[1][0] = 'M';
		name[1][1] = 'a';
		name[1][2] = 'r';
		name[1][3] = 'r';
		name[1][4] = 'y';
		
		char[][] name2 = new char[2][];
		name2[0] = new char[3];
		name2[1] = new char[5];
		
		// ���� ��Ʋ������ ž�°��� ���� �����ϴ� ���α׷�
		// (��Ʋ�� ���߿��� 10ȸ �����ϰ�, �ָ����� 2�� �����Ѵ�.)
		
		int shuttle[][] = new int[7][];
		for(int i = 0; i < 5; i++){
			shuttle[i] = new int[10];
		}
		
		shuttle[5] = new int[2];
		shuttle[6] = new int[2];
		
		// ��¥ ������ �Է�
		for(int i = 0; i<5; i++){
			for(int j = 0; j<10; j++){
				shuttle[i][j] = i + j + 10;
			}
		}
		
		for(int i = 5; i<7; i++){
			for(int j = 0; j<2; j++){
				shuttle[i][j] = i + j + 10;
			}
		}
		
		System.out.println(shuttle[2][2]); // ���: 10 (ù ��° ���� ù ��° ��Ʋ�� ž�°� ��)
		
	}
}