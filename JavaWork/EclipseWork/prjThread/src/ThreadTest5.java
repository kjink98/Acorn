// 화장실 설계도
class Toilet {
	// 문 열고 온 사람
	// synchronized 동기화처리하겠다. 동시에 처리 하지 않겠다.
	public synchronized void openDoor(String name) {
		System.out.println(name + " 입장");
		
		for(int i=0; i<10000; i++) {
			//중간중간에 일을 보고있다는 것을 한 번씩 표시
			if(i == 5000) {
				System.out.println(name + " : 끄응 ~~ ");
			}
		}
		System.out.println(name + " 퇴장");
	}
}

// 가족이 화장실을 가는 것 자체가 하나의 작업
class Family extends Thread{
	Toilet toilet;
	String who;
	
	// 화장실 주소값을 전달할거임
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}
	
	// 화장실 주소값 전달 (실행)
	@Override
	public void run() {
		toilet.openDoor(who);
	}
}
public class ThreadTest5 {

	public static void main(String[] args) {
		// TODO 동기화 처리하기
		// 화장실 만들기 (주소 생김)
		Toilet t = new Toilet();
		// 식구 만들기
		Family father = new Family(t, "아빠");
		Family mother = new Family(t, "어머니");
		Family brother = new Family(t, "형");
		Family sister = new Family(t, "누나");
		Family me = new Family(t, "나");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}

}
