//class FinishDemo implements Runnable {
//	long add = 0;
//	String name;
//
//	FinishDemo(long a, String name) {
//		this.name = name;
//		add = a;
//	}
//
//	// Thread의 동작을 구현
//	// 자식 쓰레드가 어떤 일을 할 것인지
//	@Override
//	public void run() {
//		System.out.println(name + "자식 스레드 시작");
//		long all = 0;
//
//		for (int i = 0; i <= add; i++) {
//			try {
//				// 하나의 스레드가 쉬는 동안 다른 스레드가 와서 일을 함(동시에는 일 못함)
//				// 천분의 일초 단위로 쪼개기가능
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			all += i;
//			// getName : thread 메소드에 이미 저장되어있는 걸 꺼내옴
//			System.out.println(name + ":" + all);
//		}
//		System.out.println(name + "자식 스레드 종료");
//	}
//}
//
//public class ThreadTest4 {
//
//	public static void main(String[] args) {
//		// TODO 스레드의 종료 시점
//		System.out.println("메인 스레드 시작");
//		FinishDemo t1 = new FinishDemo(5, "first");
//		// 3. 쓰레드가 3개가 됨
//		FinishDemo t2 = new FinishDemo(5, "second");
//
//		Thread tt1 = new Thread(t1);
//		Thread tt2 = new Thread(t2);
//
//		// 시스템에서 호출하라고 부탁해주는 메서드
//		tt1.start();
//		tt2.start();
//
//		// 무한 반복
//		for (;;) {
//			if (!tt1.isAlive() && !tt2.isAlive()) {
//				break;
//			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(".");
//		}
//
//		System.out.println("메인 스레드 종료");
//	}
//}
//
//
class FinishDemo implements Runnable {
	long add = 0;
	String name;

	FinishDemo(long a, String name) {
		this.name = name;
		add = a;
	}

	// Thread의 동작을 구현
	// 자식 쓰레드가 어떤 일을 할 것인지
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		long all = 0;

		for (int i = 0; i <= add; i++) {
			try {
				// 하나의 스레드가 쉬는 동안 다른 스레드가 와서 일을 함(동시에는 일 못함)
				// 천분의 일초 단위로 쪼개기가능
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			// getName : thread 메소드에 이미 저장되어있는 걸 꺼내옴
			System.out.println(name + ":" + all);
		}
		System.out.println(name + "자식 스레드 종료");
	}
}

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 종료 시점
		System.out.println("메인 스레드 시작");
		FinishDemo t1 = new FinishDemo(5, "first");
		// 3. 쓰레드가 3개가 됨
		FinishDemo t2 = new FinishDemo(5, "second");

		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);

		// 시스템에서 호출하라고 부탁해주는 메서드
		tt1.start();
		tt2.start();

		// 무한 반복
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}
		tt1.join(); // 메인이 늦게 끝남
		tt2.join();
		System.out.println("메인 스레드 종료");
	}
}
