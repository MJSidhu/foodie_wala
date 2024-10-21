// 2d array sorted search
import java.util.Scanner;

class p6 {
    public static void sorting(int arr[][],int se){
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        int j=m-1;
        while(i<n&&j>=0){
            if(arr[i][j]==se){
            System.out.println("the element is present in coloumn "+j+" of row "+i);
            System.exit(0);
            }
            else if(arr[i][j]>se)
            j--;
            else if(arr[i][j]<se)
            i++;
        }
        System.out.println("the element is not present in the matrix");
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
       System.out.println("enter the search element:");
       int se=sc.nextInt();
       sorting(arr,se);
       sc.close();
    }

}
