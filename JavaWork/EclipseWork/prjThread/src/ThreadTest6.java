import java.util.Stack;

class AutoMachine {
	// Stack 생성
	Stack store = new Stack();
	
	// 어떤 음료수를 넣었는지
	synchronized void putDrink(String drink) {
		// 집어 넣기
		store.push(drink);
		// (동기화) 자판기에 있는 음료수를 꺼내먹는걸 시작해라(깨우기)
		notify();
	}
	
	// 음료수를 꺼내 먹는 기능
	// (동기화) 꺼내먹을 때 자판기가 비어있는지 확인하기
	synchronized String getDrink() {
		// (동기화)비어있는 동안에는 pop을 하면 안됨. 비어있으면 잠깐 쉬어가라!
		while(store.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 꺼내기
		return store.pop().toString();
	}
}

// 관리자(음료를 채워야하는 작업)
class Producer extends Thread{
	private AutoMachine auto;
	
	
	// 자판기 주소
	public Producer(AutoMachine auto) {
		this.auto = auto;
	}
	
	@Override
	// 음료수 채우기
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + " : 음료수 No." + i + " 채워넣음");
			auto.putDrink("음료수 No." + i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 소비자 (꺼내먹는 작업)
class Consumer extends Thread{
private AutoMachine auto;
	
	
	// 자판기 주소
	public Consumer(AutoMachine auto) {
		this.auto = auto;
	}
	
	@Override
	// 음료수 꺼내기
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + " : 음료수 No." + i + " 꺼내먹음");
			auto.getDrink();
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadTest6 {

	public static void main(String[] args) {
		// TODO wait, notify
		// 자판기 생성
		AutoMachine auto = new AutoMachine();
		
		//관리자 생성
		Producer hong = new Producer(auto);
		
		// 소비자 생성
		Consumer kim  = new Consumer(auto);
		
		hong.start();
		kim.start();
		// 음료수가 없는대 꺼내먹으면 오류가 생김. -> 동기화 해서 처리
	}

}
