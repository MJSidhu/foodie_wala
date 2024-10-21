import java.util.*;
class p2{
    public static void minvalue(int arr[][]){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j])
                min=arr[i][j];
            }
           }
           System.out.println("the minimum element in the matrix is"+min);
    }
    public static void maxvalue(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j])
                max=arr[i][j];
                
            }
           }
           System.out.println("the maximum element in the matrix is"+max);
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
    minvalue(arr);
    maxvalue(arr);
       sc.close();
    }
}
