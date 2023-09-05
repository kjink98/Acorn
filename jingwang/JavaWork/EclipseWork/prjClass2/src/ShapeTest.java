abstract class TwoDShape {
	// 도형의 공통적인 속성
	private double width; // 폭
	private double height; // 높이
	private String name; // 이름

	// 생성자
	public TwoDShape(double width, double height, String name) {
		super();
		this.width = width;
		this.height = height;
		this.name = name;
	}

	// getter
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	// 면적 메서드
	/*
	public double getArea() {
		return 0.0; // 이 코드는 자식 클래스에서 어차피 수정되기 때문에 필요없는 코드임
		// 하지만 비워두면 오류남.
		// 그래서 사용하는 것이 추상 메서드
	}
	*/
	// 추상 메서드
	public abstract double getArea();
}

class Triangle extends TwoDShape {
	// 상속 받아 오기
	Triangle(double w, double h, String n) {
		super(w, h, n);
	}

	// 오버라이딩. 삼각형 면적 구하기
	// annotation : 실수를 방지하기 위해 선언(여기서는 부모와 형태가 다르면 오류)
	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2;
	}
}

class Rectangle extends TwoDShape {
	// 상속 받아 오기
	Rectangle(double w, double h, String n){
			super(w, h, n);
		}

	// 오버라이딩. 삼각형 면적 구하기
	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		// TODO 2차원 도형을 그리기 위한 프로그램
		Triangle tr1 = new Triangle(5.0, 5.0, "정삼각형");
		Triangle tr2 = new Triangle(7.0, 15.0, "직각삼각형");
		
		Rectangle re1 = new Rectangle(3.0, 3.0, "정사각형");
		Rectangle re2 = new Rectangle(3.0, 6.0, "직사각형");
		
//		TwoDShape ts1 = new TwoDShape(5.0, 5.0, "2차원 도형");
		
//		System.out.println(tr1.getName() + " : " + tr1.getArea());
//		System.out.println(re1.getName() + " : " + re1.getArea());
		
		// TwoDShape가 부모 클래스이기 때문에 tr1, tr2, ... 등을 다 묶을 수 있음
		TwoDShape[] t = {tr1, tr2, re1, re2, 
				new Rectangle(3.0, 4.0, "그냥 사각형")};
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName() + ": " + t[i].getArea());
		}
		
	}

}
