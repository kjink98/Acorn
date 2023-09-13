public class SelectSort{
	
	public static void swap(int a[], int i, int j){
		int temp = a[i];
		a[i] = a[j+1];
		a[j+1] = temp;
	}
	
	public static void main(String[] args){
		int data[] = {2, 9, 10, 3, 7, 15, 5};
		
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + "\t");
		}
		System.out.println("\n선택 정렬 후...");
		
		for(int i=0; i <data.length-1;i++){
			for(int j = i+1; j < data.length; j++){
				if(data[i] > data[j]){
					swap(data, i, j);
				}
				
			}
			
		}
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + "\t");
		}
	}
}