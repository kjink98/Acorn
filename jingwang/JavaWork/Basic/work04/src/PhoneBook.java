public class PhoneBook{
	public static void main(String[] args) {
		/*
		java PhoneBook
		���� : java PhoneBook ����̸�
		java PhoneBook ȫ�浿
		
		ȫ�浿 111-1111 ����� ������
		----------------------
		String data[][] = {
			{"ȫ�浿", "111-1111", "����� ������"},
			{"�Ӳ���", "222-2222", "����� ���α�"},
			{"�Ż��Ӵ�", "333-3333", "����� ������"}
		}
		*/
		
		String data[][] = {
			{"ȫ�浿", "111-1111", "����� ������"},
			{"�Ӳ���", "222-2222", "����� ���α�"},
			{"�Ż��Ӵ�", "333-3333", "����� ������"}
		};
		if (args.length == 0){
			System.out.println("���� : java PhoneBook ����̸�");
		} else {
			for(int i = 0; i < data.length; i++){
				if(args[0].equals(data[i][0]))
					System.out.print(data[i][0] + " " + data[i][1] + " " + data[i][2]);
			} // for�� ����
		} //else�� ����
	}
}