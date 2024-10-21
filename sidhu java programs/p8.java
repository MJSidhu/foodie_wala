import java.util.*;
class p8 {
    public static int searching(int arr[][],int se){
        int n=arr.length;
        int m=arr[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(se==arr[i][j])
                c++;
            }
        }
        return c;
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
      int k=searching(arr,se);
      System.out.println("the element is present "+k+" times");
      sc.close();
    }
}
