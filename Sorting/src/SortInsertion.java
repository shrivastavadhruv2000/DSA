import java.util.Arrays;

public class SortInsertion {

	public static void main(String[] args) {
		int[] arr= {45,32,21,11,22,12,71};
		
		System.out.println("Given Array: ");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println("Sorted Arra: y");
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionsort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
				
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
