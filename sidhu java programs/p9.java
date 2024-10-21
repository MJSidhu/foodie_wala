 import java.util.*;
 class p9 {
    public static int logic(int arr[][]){
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            sum=sum+arr[1][i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
       int n=sc.nextInt();
       System.out.println("ënter the number of columns:");
       int m=sc.nextInt();
       int arr[][]=new int[n][m];
       System.out.println("enter the values in the array:");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       int k=logic(arr);
       System.out.println("the sum of 2nd row of matrix is: "+k);
       sc.close();
}
 }
