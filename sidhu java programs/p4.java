// SPIRAL MATRIX CODE//
import java.util.*;
public class p4 {
    public static void spiralmatrix(int arr[][]){
        int sc=0;
        int sr=0;
        int er=arr.length-1;
        int ec=arr[0].length-1;
        while(sc<=ec&&sr<=er){
        for(int i=sc;i<=ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        for(int i=sr+1;i<=er;i++){
            System.out.print(arr[i][ec]+" ");
        }
        for(int i=ec-1;i>=sc;i--){
            System.out.print(arr[er][i]+" ");
        }
        for(int i=er-1;i>=sr+1;i--){
        System.out.print(arr[i][sc]+" ");
    }
    sc++;
    sr++;
    er--;
    ec--;
}

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
       spiralmatrix(arr);
       sc.close();
}
}