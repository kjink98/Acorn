// stop
//class StopDemo implements Runnable {
//
//	@Override
//	public void run() {
//		try {
//			while (true) {
//				System.out.println("Thread is alive");
//				Thread.sleep(500);
//			}
//
//		} catch (InterruptedException err) {
//			err.printStackTrace();
//		} finally {
//			System.out.println("Thread is dead ...");
//		}
//	}
//
//}
//
//public class ThreadTest3 {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO 스레드의 강제 종료
//		StopDemo demo = new StopDemo();
//		Thread t = new Thread(demo);
//
//		t.start();
//		Thread.sleep(5000);
//		
//		t.stop();
//	}
//
//}

// interrupt
/*
class StopDemo implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("Thread is alive");
				Thread.sleep(500);
			}

		} catch (InterruptedException err) {
			err.printStackTrace();
		} finally {
			System.out.println("Thread is dead ...");
		}
	}

}

public class ThreadTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 강제 종료
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);

		t.start();
		Thread.sleep(5000);
		
		t.interrupt();
	}

}
*/

// flag
class StopDemo implements Runnable {
	private boolean stopped = false;
	
	void off() {
		stopped = true;
	}
	@Override
	public void run() {
		try {
			while (!stopped) {
				System.out.println("Thread is alive");
				Thread.sleep(500);
			}

		} catch (InterruptedException err) {
			err.printStackTrace();
		} finally {
			System.out.println("Thread is dead ...");
		}
	}

}

public class ThreadTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 강제 종료
		StopDemo demo = new StopDemo();
		Thread t = new Thread(demo);

		t.start();
		Thread.sleep(5000);
		
		demo.off();
	}

}
