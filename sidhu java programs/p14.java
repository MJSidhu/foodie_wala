// insertionsort in decending order
import java.util.*;
class p14 {
    void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
    }
}
    void insertionsort(int arr[]){
        int n = arr.length;
        int key,j;
        for(int i=0;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
        }
        arr[j+1]=key;
    }
    
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
    p14 ob=new p14();
    ob.insertionsort(arr);
    ob.printarray(arr);
    sc.close();
}
}
