//
//public class ThreadTest1 {
//	long add = 0;
//	
//	ThreadTest1(long a) {
//		add = a;
//	}
//	public static void main(String[] args) {
//		ThreadTest1 t = new ThreadTest1(100);
//		long all = 0;
//		
//		for(int i=0; i<=t.add; i++) {
//			all += i;
//			System.out.println(all);
//		}
//	}
//
//}

// 2. 이 클래스가 쓰레드가 됨
public class ThreadTest1 extends Thread {
	long add = 0;
	String name;

	ThreadTest1(long a, String n) {
		add = a;
		name = n;
	}

	// Thread의 동작을 구현
	// 자식 쓰레드가 어떤 일을 할 것인지
	@Override
	public void run() {
		long all = 0;
		
		for (int i = 0; i <= add; i++) {
			try {
				// 하나의 스레드가 쉬는 동안 다른 스레드가 와서 일을 함(동시에는 일 못함)
				// 천분의 일초 단위로 쪼개기가능
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			all += i; 
			System.out.println(name + ":" + all);
		}
	}

	public static void main(String[] args) {
		// 1. 쓰레드에서 상속 받았기 때문에
		ThreadTest1 t1 = new ThreadTest1(5, "첫 번째 스레드");
		// 3. 쓰레드가 3개가 됨
		ThreadTest1 t2 = new ThreadTest1(5, "두 번째 스레드");

		// 시스템에서 호출하라고 부탁해주는 메서드
		t1.start();
		t2.start();
	}

}
