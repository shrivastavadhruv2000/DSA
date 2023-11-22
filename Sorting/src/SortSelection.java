import java.util.Arrays;

public class SortSelection {

	public static void main(String[] args) {
		int[] arr= {34,2,45,1,23};
		System.out.println("Given array: ");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		
	}

}
