// selectionsort
import java.util.Scanner;

class p12 {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        int minp;
        int t;
        for(int i=0;i<n-1;i++){
             minp=i;
            for(int j=i+1;j<n;j++){
                if(arr[minp]>arr[j]){
                    minp=j;
                }
            }
            t=arr[i];
            arr[i]=arr[minp];
            arr[minp]=t;
        }
        printarray(arr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the values in the array:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        selectionsort(arr);
        sc.close();
}
}
