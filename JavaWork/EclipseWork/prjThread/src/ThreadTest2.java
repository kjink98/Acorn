//public class ThreadTest2 implements Runnable {
//	long add = 0;
//	String name;
//
//	ThreadTest2(long a, String n) {
//		add = a;
//		name = n;
//	}
//	
//	@Override
//	public void run() {
//		long all = 0;
//		
//		for (int i = 0; i <= add; i++) {
//			try {
//				// 하나의 스레드가 쉬는 동안 다른 스레드가 와서 일을 함(동시에는 일 못함)
//				// 천분의 일초 단위로 쪼개기가능
//				// Runnable클래스를 가져오면 Thread 클래스에서 sleep 메서드를 가져와야한다.
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
//			all += i; 
//			System.out.println(name + ":" + all);
//		}
//	}
//
//	// 메인만 쓰레드임
//	public static void main(String[] args) {
//		// Runnable(인터페이스)을 상속받았다해서 스레드가 아님
//		ThreadTest2 t1 = new ThreadTest2(5, "첫 번째 스레드");
//		ThreadTest2 t2 = new ThreadTest2(5, "두 번째 스레드");
//		
//		// 스레드 생성
//		Thread tt1 = new Thread(t1);
//		Thread tt2 = new Thread(t1);
//		
//		// 시스템에서 호출하라고 부탁해주는 메서드
//		tt1.start();
//		tt2.start();
//	}
//
//}

/*
//2. 이 클래스가 쓰레드가 됨
public class ThreadTest2 implements Runnable {
	long add = 0;
	// 처리 할 수 있는 이름이 있어야됨
	String name;
	
	ThreadTest2(long a, String name) {
		// 객체가 생성되지 않으므로 super을 가질 수 없음
//		super(name);
		this.name = name;
		add = a;
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
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			all += i; 
			// getName : thread 메소드에 이미 저장되어있는 걸 꺼내옴
			System.out.println(name + ":" + all);
		}
	}

	public static void main(String[] args) {
		// TODO Thread 클래스를 상속받아 스레드를 만드는 방법
		// 1. 쓰레드에서 상속 받았기 때문에
		ThreadTest2 t1 = new ThreadTest2(5, "first");
		// 3. 쓰레드가 3개가 됨
		ThreadTest2 t2 = new ThreadTest2(5, "second");
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t1);
		
		// 시스템에서 호출하라고 부탁해주는 메서드
		tt1.start();
		tt2.start();
	}

}
*/
class ThreadDemo implements Runnable{
	String name;
	Thread t;
	
	public ThreadDemo(String name) {
		this.name = name;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println(name = ":" + i);
		}
	}
	
}

public class ThreadTest2{
	public static void main(String[] args) {
		ThreadDemo d1 = new ThreadDemo("스레드1");
		ThreadDemo d2 = new ThreadDemo("스레드2");
		ThreadDemo d3 = new ThreadDemo("스레드3");
		
	}
}