import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        int n;
        //int a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SortQuick q1=new SortQuick();
        q1.quick1(a,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(a[i] + "\t");
        }


    }
}
class SortQuick{
        int partition(int a[],int start,int end){
        int pivot=a[end];
        int pindex=start;

        for(int i=start;i<=end-1;i++){
            if(a[i]<=pivot){
                int t=a[pindex];
                a[pindex]=a[i];
                a[i]=t;
                pindex++;
            }
        }
        int t=a[pindex];
        a[pindex]=a[end];
        a[end]=t;
        return (pindex);


    }
    void quick1(int a[],int start,int end){
        if(start<end)
        {
            int p =partition(a,start,end);
            quick1(a,start,p-1);
            quick1(a,p+1,end);
        }
    }

}
