class GenericDemo<T> {
	T value; // 미리 형식을 지정하지 않겠다. 실행중에 형식을 결정하겠다.
	
	public GenericDemo(T val) {
		value = val;
	}
	
	T getValue() {
		return value;
	}
}
public class GenericTest2 {

	public static void main(String[] args) {
		// TODO Template 기능
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10);
		System.out.println(demo1.getValue());

		GenericDemo demo2 = new GenericDemo(3.14);
		System.out.println(demo2.getValue());
		
		GenericDemo demo3 = new GenericDemo("이것은 제너릭");
		System.out.println(demo3.getValue());
	}

}
