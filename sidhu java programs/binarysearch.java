
class binarysearch {
    public static int bsearch(int arr[],int l,int s){
        int st=0,e=l,mid;
        while(st<=e){
            mid=(st+e)/2;
            if(arr[mid]==s)
                return mid;
            else if(arr[mid]>s)
                e=mid-1;
            else if(arr[mid]<s)
                st=mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int s=4;
        int l=arr.length-1;
        int c=bsearch(arr,l,s);
        if(c==-1)
        System.out.print("The element is not present in the array");
        else
        System.err.println("the element is present in "+c+" index of the array");
    }
}
