class Fdemo {
	int count;
	
	Fdemo(int cnt){
		count = cnt;
	}
	
	protected void finalize(){
		System.out.println("GC ������ : " + count);
	}
}
public class FinalizeTest{
	public static void main(String[] args){
		for(int i = 0; i <500000; i++){
			new Fdemo(i);
		}
	}
}