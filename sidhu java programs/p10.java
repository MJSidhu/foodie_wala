import java.util.*;
class p10 {
    public static void print2darray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int arr1[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        print2darray(arr1);
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
       transpose(arr);
       sc.close();
}
}