//  #bubble sort
 import java.util.*;
 class p11 {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubblesort(int arr[]){
        int l=arr.length;
        int t;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
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
        bubblesort(arr);
        sc.close();
}
 }