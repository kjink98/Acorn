public class ScannerTest {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		String name = scan.next();
		System.out.println("����� �̸��� " + name + "�̴�.");
		
		System.out.print("���� �Է�: ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "���̴�.");
		
		System.out.print("���� �Է�: ");
		double score = scan.nextDouble();
		System.out.println("����� ������ " + score + "���̴�.");
	}
}