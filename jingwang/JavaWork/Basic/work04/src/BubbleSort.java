public class BubbleSort{
	public static void swap(int a[], int i){
		int temp = a[i];
		a[i] = a[i+1];
		a[i+1] = temp;
	}
	
	public static void main(String[] args){
		int data[] = {2, 9, 10, 3, 7, 15, 5};
		
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + "\t");
		}
		System.out.println("\n버블 정렬 후...");
		
		boolean swapped = false;
		
		for(int i = 0; i < data.length - 1; i++){
			for(int j = 0; j < data.length - 1; j++){
				if(data[j] > data[j+1]){
					swap(data, j);
					swapped = true;
				}
			}
			if(!swapped) break;
		}
		
		
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + "\t");
		}
	}
}