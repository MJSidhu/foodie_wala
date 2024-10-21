// insertion sort
import java.util.Scanner;

class p13 {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionsort(int arr[]){
        int n=arr.length;
        int k;
        int j;
        for(int i=0;i<n;i++){
            k=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
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
        insertionsort(arr);
        sc.close();
}
}