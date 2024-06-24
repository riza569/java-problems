public class binarysearch {
    public static void main(String[] args) {
            int arr[]={3, 4, 6, 7, 9, 12, 16, 17};
            int n=arr.length;
            int target=6;
            int b=binarysearch(arr,0,n-1,target);
            if(b==-1)System.out.println("nope");
            else System.out.println("yep "+b);
     
    }

    private static int binarysearch(int[] arr,int low,int high,int target) {
        if(low>high)return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){

           return binarysearch(arr, low, mid,target);
        }else{
            return binarysearch(arr, mid+1, high,target);
        }
    }
}