public class searchposition {
    public static void main(String[] args) {
        int arr[]={1,2,4,7};
        int x=6;
        int n=arr.length;
        int ind=search(arr,n,x);
        System.out.println("index is "+ind);
        }

    private static int search(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
