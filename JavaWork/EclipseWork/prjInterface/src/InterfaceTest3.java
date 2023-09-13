import java.util.Scanner;

interface Volume {
	void volumeUp(int vol);

	void volumeDown(int vol);

	void mute();

}

interface Power {
	void powerOn();

	void powerOff();
}

// TV
class TV implements Volume, Power {
	private int vol;
	private boolean power = false;

	public void volumeUp(int vol) {

		if (power = false) {
			System.out.println("전원을 켜주세요");
		} else {
			this.vol += vol;
			if (this.vol >= 50) {
				System.out.println("최대 음량은 50입니다.");
				this.vol = 50;
			} else {
				System.out.println("현재 TV 볼륨을 " + this.vol + "만큼 올렸습니다.");
			}
		} // else 종료
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}

	public void volumeDown(int vol) {
		if (power = false) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.vol < 0) {
				this.vol = 0;
				System.out.println("최소 음량은 0입니다.");
			} else {
				this.vol -= vol;
				System.out.println("현재 TV 볼륨을 " + this.vol + "만큼 내렸습니다.");
			}
		} // else 종료
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}

	public void mute() {
		if (this.vol == 0) {
			System.out.println("음소거 상태입니다.");
			this.vol = 0;
		} // if문 종료
	}

	public void powerOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
	}

	public void powerOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");

	}
}

// 라디오
class Radio implements Volume, Power {
	private int vol;
	private boolean power = false;

	public void volumeUp(int vol) {
		if (power = false) {
			System.out.println("전원을 켜주세요");
		} else {
			this.vol += vol;
			if (this.vol >= 50) {
				this.vol = 50;
				System.out.println("최대 음량은 50입니다.");
			} else {
				System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 올렸습니다.");
			}
		} // else 종료
		System.out.println("현재 라디오 볼륨 : " + this.vol);
	}

	public void volumeDown(int vol) {
		if (power = false) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.vol < 0) {
				this.vol = 0;
				System.out.println("최소 음량은 0입니다.");
			} else {
				this.vol -= vol;
				System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 내렸습니다.");
			}
		} // else 종료
		System.out.println("현재 라디오 볼륨 : " + this.vol);
	}

	public void mute() {
		if (this.vol == 0) {
			System.out.println("음소거 상태입니다.");
			this.vol = 0;
		} // if문 종료
	}

	public void powerOn() {
		power = true;
		System.out.println("라디오가 켜졌습니다.");
	}

	public void powerOff() {
		power = false;
		System.out.println("라디오가 꺼졌습니다.");

	}
}

// 선택
class Choice {
	// 제품 선택
	void choiceProduct() {
		System.out.println("제품을 선택하세요");
		System.out.println("1. TV");
		System.out.println("2. 라디오");
		System.out.println("3. 종료");
		System.out.println("선택 : ");

	}

	// 볼륨 선택
	void choiceVolume() {
		System.out.println("볼륩 조절");
		System.out.println("1. 볼륨 증가");
		System.out.println("2. 볼륨 감소");
		System.out.println("3. 음소거");
		System.out.println("4. 종료");
		System.out.println("선택 : ");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO 인터페이스 응용 프로그램 복습
		/*
		 * 1. Power 인터페이스를 작성하여 오버라이딩한다. 2. 소리를 높일 때 50 이상 넘지 않게 한다. 3. 소리를 낮출 때 0 미만으로
		 * 줄일 수 없게 한다. (0은 음소거 기능) 4. 소리를 켜거나 줄일 때 반드시 전원이 켜져 있을 때에만 가능하게 한다.
		 * 
		 * **** 실행 예시 제품 선택 1. tv 2. radio 선택 : _
		 * 
		 * tv 전원을 켜시겠습니까?(y/n) : 전원이 켜져 있다면 1. 소리 증가 2. 소리 감소 3. 음소거 선택 :
		 */

		Scanner sc = new Scanner(System.in);
		Choice choice = new Choice();
		TV tv = new TV();
		Radio radio = new Radio();
		int choiceProd; // 제품 선택 변수
		String choicePower = ""; // 전원 여부 선택 변수
		int choiceVol; // 볼륨 조절 선택 변수
		int vol; // 볼륨 조절 변수

		// 제품 선택
		choice.choiceProduct();
		choiceProd = sc.nextInt();
		System.out.println(choiceProd + "번을 선택하셨습니다.");

		// 1. TV 전원을 켰을 떄
		if (choiceProd == 1) {
			System.out.println("전원을 키시겠습니까? (y/n)");
			choicePower = sc.next();
			if (choicePower.equals("y")) {
				tv.powerOn();

				choice.choiceVolume();
				choiceVol = sc.nextInt();
				System.out.println(choiceVol + "번을 선택하셨습니다.");

				switch (choiceVol) {
				// 볼륨 증가 선택 시
				case 1:
					System.out.println("볼륨을 얼마나 올리시겠습니까?");
					vol = sc.nextInt();
					tv.volumeUp(vol);
					break;
				// 볼륨 감소 선택 시
				case 2:
					System.out.println("볼륨을 얼마나 내리시겠습니까?");
					vol = sc.nextInt();
					tv.volumeDown(vol);
					break;
				// 음소거 선택 시
				case 3:
					tv.mute();
					break;
				// 종료 선택 시
				case 4:
					System.out.println("종료 되었습니다.");
					break;
				} // switch문 종료

			}
			// TV 전원을 껐을 때
			else if (choicePower.equals("n")) {
				tv.powerOff();
			} // else if 문 종료
		} // if문 종료

		// 1. 라디오 전원을 켰을 떄
		else if (choiceProd == 2) {
			System.out.println("전원을 키시겠습니까? (y/n)");
			choicePower = sc.next();
			if (choicePower.equals("y")) {
				radio.powerOn();

				choice.choiceVolume();
				choiceVol = sc.nextInt();
				System.out.println(choiceVol + "번을 선택하셨습니다.");

				switch (choiceVol) {
				// 볼륨 증가 선택 시
				case 1:
					System.out.println("볼륨을 얼마나 올리시겠습니까?");
					vol = sc.nextInt();
					radio.volumeUp(vol);
					break;
				// 볼륨 감소 선택 시
				case 2:
					System.out.println("볼륨을 얼마나 내리시겠습니까?");
					vol = sc.nextInt();
					radio.volumeDown(vol);
					break;
				// 음소거 선택 시
				case 3:
					radio.mute();
					break;
				// 종료 선택 시
				case 4:
					System.out.println("종료 되었습니다.");
					break;
				} // switch문 종료

			}
			// 라디오 전원을 껐을 때
			else if (choicePower.equals("n")) {
				radio.powerOff();
			} // else if 문 종료
		} // if문 종료
		
		// 종료를 선택
		else if(choiceProd == 3) {
			System.out.println("종료 되었습니다.");
		}
		else
			System.out.println("올바른 숫자를 입력해주세요");
	}

}