public class ArrayTest2{
	public static void main(String[] args) throws java.io.IOException {
		char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.print("찾고자 하는 문자 입력: ");
		char search = (char)System.in.read();
		
		boolean flag = false;
		int i = 0;
		
		for(; i < data.length; i++){
			if(data[i] == search){
				flag = true;
				break;
			}
		}
		
		if (flag == true)
			System.out.println((i+1) + "번째에서 찾았다.");		
		else 
			System.out.println("못 찾았다.");
		
		System.out.println("----------------");
		
		// 이진 검색
		int left = 0;
		int mid = 0;
		int right = data.length - 1;
		
		boolean foundBinary = false;
		
		while (left <= right){
			mid = (left + right) / 2;
			if(data[mid] == search){
				foundBinary = true;
				break;
			}
			if(data[mid] < search){
				left = mid + 1;
			} else if (data[mid] > search) {
				right = mid - 1;
			}
		} 
		
		if (foundBinary)
			System.out.println("찾았다.");		
		else 
			System.out.println("못 찾았다.");
		
	}
}