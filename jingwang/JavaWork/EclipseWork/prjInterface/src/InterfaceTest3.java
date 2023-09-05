import java.util.Scanner;

interface Volume {
	void volumeUp(int vol);

	void volumeDown(int vol);

	void mute(int vol);
}

interface Power {
	void powerOn();

	void powerOff();

}

class TV implements Volume, Power {
	private int vol;

	@Override
	public void volumeUp(int vol) {
		this.vol += vol;
		if (this.vol >= 50) {
			System.out.println("50이 최대 음량입니다.");
			this.vol = 50; // 최대 음량을 제한
		} else {
			System.out.println("현재 TV 볼륨을 " + this.vol + "만큼 올렸습니다.");
		}
		
		System.out.println("현재 TV 볼륨 : " + this.vol);

	}

	@Override
	public void volumeDown(int vol) {


		if (this.vol < 0) {
			System.out.println("0이 최소 음량입니다.");
			this.vol = 0; // 최소 음량을 제한
		} else {
			System.out.println("현재 TV 볼륨을 " + this.vol + "만큼 내렸습니다.");
		}
		
		System.out.println("현재 TV 볼륨 : " + this.vol);

	}

	public void mute(int vol) {
		if (this.vol == 0) {
			System.out.println("음소거 상태 입니다.");
			this.vol = 0;
		}
	}

	@Override
	public void powerOn() {
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("TV가 꺼졌습니다.");
	}
}

class Radio implements Volume, Power {
	private int vol;

	@Override
	public void volumeUp(int vol) {

		this.vol += vol;
		if (this.vol >= 50) {
			this.vol = 50;
			System.out.println("50이 최대 음량입니다.");
		} else {
			System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 올렸습니다.");
		}
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}

	@Override
	public void volumeDown(int vol) {

		if (this.vol < 0) {
			System.out.println("0이 최소 음량입니다.");
			this.vol = 0;
		} else {
			this.vol -= vol;		
			System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 내렸습니다.");
		}
		System.out.println("현재 TV 볼륨 : " + this.vol);
	}

	@Override
	public void mute(int vol) {
		if (this.vol == 0) {
			System.out.println("음소거 상태 입니다.");
			this.vol = 0;
		}
	}

	@Override
	public void powerOn() {

		System.out.println("라디오가 켜졌습니다.");

	}

	@Override
	public void powerOff() {

		System.out.println("라디오가 꺼졌습니다.");

	}
}

class Choice {
	void productChoice() {
		System.out.println("제품을 선택하세요");
		System.out.println("1. TV");
		System.out.println("2. 라디오");
		System.out.println("3. 종료");
		System.out.println("선택 :");
	}

	void volumeChoice() {
		System.out.println("볼륨 조절");
		System.out.println("1. 소리증가");
		System.out.println("2. 소리감소");
		System.out.println("3. 음소거");
		System.out.println("선택 : ");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO 인터페이스 응용 프로그램
		/*
		 * 1. Power 인터페이스를 작성하여 오버라이딩한다. 2. 소리를 높일 때 50 이상 넘지 않게 한다. 3. 소리를 낮출 때 0 미만으로
		 * 줄일 수 없게 한다. (0은 음소거 기능) 4. 소리를 켜거나 줄일 때 반드시 전원이 켜져 있을 때에만 가능하게 한다.
		 * 
		 * **** 실행 예시 제품 선택 1. tv 2. radio 선택 : _
		 * 
		 * tv 전원을 켜시겠습니까?(y/n) : 전원이 켜져 있다면 1. 소리 증가 2. 소리 감소 3. 음소거 선택 :
		 */
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		Radio radio = new Radio();
		Choice choice = new Choice();
		String choicePower = ""; // 전원 on/off 선택
		int choiceVol; // 볼륨 조절 선택
		int vol; // 볼륨 크기 설정
		
		// CHOICE PRODUCT
		choice.productChoice();
		int choiceProduct = sc.nextInt();
		System.out.println(choiceProduct + "번이 선택 되었습니다.");

		// POWER SWITCH
		if (choiceProduct == 1) {
			System.out.println("TV 전원을 켜시겠습니까? (y/n)");
			choicePower = sc.next();
			if (choicePower.equals("y")) {
				tv.powerOn();
				while (true) {
					choice.volumeChoice();
					choiceVol = sc.nextInt();
					System.out.println(choiceVol + "번이 선택 되었습니다.");
					if(choiceVol==1) {
						System.out.println("얼마나 증가할까요?");
						vol = sc.nextInt();
						tv.volumeUp(vol);
						break;
					} // 소리 증가 선택 if문 종료
					else if (choiceVol == 2) {
						System.out.println("얼마나 감소할까요?");
						vol = sc.nextInt();
						tv.volumeDown(vol);
						break;
					}
					else if (choiceVol == 3) {
						tv.mute(0);
						break;
					}
				} // tv가 켜져있을 때 while문 종료
			} else {
				System.out.println("전원을 키지 않으셨습니다. 종료합니다.");
			}
		} else if (choiceProduct == 2) {
			System.out.println("라디오 전원을 켜시겠습니까? (y/n)");
			choicePower = sc.next();
			if (choicePower.equals("y")) {
				radio.powerOn();
				while (true) {
					choice.volumeChoice();
					choiceVol = sc.nextInt();
					System.out.println(choiceVol + "번이 선택 되었습니다.");
					if(choiceVol==1) {
						System.out.println("얼마나 증가할까요?");
						vol = sc.nextInt();
						radio.volumeUp(vol);
						break;
					} // 소리 증가 선택 if문 종료
					else if (choiceVol == 2) {
						System.out.println("얼마나 감소할까요?");
						vol = sc.nextInt();
						radio.volumeDown(vol);
						break;
					}
					else if (choiceVol == 3) {
						radio.mute(0);
						break;
					}
				} // tv가 켜져있을 때 while문 종료
			} else {
				System.out.println("전원을 키지 않으셨습니다. 종료합니다.");
			}
		} else if (choiceProduct == 3) {
			System.out.println("종료하겠습니다.");
			choicePower = sc.next();
		} else
			System.out.println("선택지 중 선택해주세요");

	}

}