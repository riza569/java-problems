public class lowerbound {
    public static void main(String[] args) {
        int arr[]={3, 5, 9,10,12, 15, 19};
        int x=8;
        int n=arr.length;
        int ind=lowerbound(arr,n,x);
        System.out.println();
        System.out.println(ind);
    }

    private static int lowerbound(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
                ans=mid;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}
