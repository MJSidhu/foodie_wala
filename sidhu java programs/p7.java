// sorted 2d array search using binary search
import java.util.Scanner;

class p7 {
    public static void rowsearch(int arr[][],int se){
        int n1=arr.length-1;
        int m1=arr[0].length-1;
        int st,mid,e;
        for(int i=0;i<=n1;i++){
         st=0;e=m1;
         while(st<=e){
             mid=(st+e)/2;
             if(arr[i][mid]==se){
                System.out.println("the element is present in column "+mid+" of row "+i);
                System.exit(0);
            }
            else if(arr[i][mid]>se)
                e=mid-1;
            else if(arr[i][mid]<se)
                st=mid+1;
        }
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
       rowsearch(arr,se);
       sc.close();
    }
    
}
