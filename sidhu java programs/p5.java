import java.util.*;
public class p5 {
    public static void prdiasum(int arr[][]){
        int r=arr.length,s=0;
        // int c=arr[0].length;
        for(int i=0;i<r;i++){
            s=s+arr[i][i];
        }
        System.out.println("the sum of primary diagonal:"+s);

    }
    public static void sediasum(int arr[][]){
        int r=arr.length,s=0;
        for(int i=r-1;i>=0;i--){
            s=s+arr[i][i];
        }
        System.out.println("the sum of secondary diagonal:"+s);}
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
       int n=sc.nextInt();
       System.out.println("ënter the number of columns:");
       int m=sc.nextInt();
       if(n!=m){
        System.out.println("the size of rows and columns should be equal");
        System.exit(0);
       }
       int arr[][]=new int[n][m];
       System.out.println("enter the values in the array:");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       prdiasum(arr);
       sediasum(arr);
       sc.close();
}
}
