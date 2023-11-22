import java.util.Arrays;

public class SortBubble {
	public static void main(String[] args) {
		int[] arr= {43,32,45,21,31};
	    System.out.println("Given array: ");
	    System.out.println(Arrays.toString(arr));
	    //bubbleSort(arr);
	    improvedBubbleSort(arr);
	    System.out.println("Sorted Array: ");
	    System.out.println(Arrays.toString(arr));
	    
	}

	private static void improvedBubbleSort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<(n-i-1);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
		
	}

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	
    
    

}
