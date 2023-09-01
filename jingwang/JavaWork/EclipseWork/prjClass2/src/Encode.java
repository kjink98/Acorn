
public class Encode {

	public static void main(String[] args) {
		String msg = "X맨은 홍길동이다.";
		String key = "axdk?*!z";
		String enc = "", dec = ""; // 암호화, 복호화 시킬 변수
		
		// 메시지를 암호화한 값
		int cnt = 0;
		for(int i=0; i<msg.length(); i++) {
			// msg의 문자와 key의 문자를 한 글자씩 뽑아와 enc에 넣어준다
			enc += (char)(msg.charAt(i)^key.charAt(cnt));
			cnt++;
			// key의 문장을 다돌면 다시 돌기 위해 cnt 초기화
			if(cnt == key.length()) {
				cnt = 0;
			}
		}
		
		System.out.println("암호화된 값: " + enc);
		// 암호화된 메시지를 복호화
	}

}
