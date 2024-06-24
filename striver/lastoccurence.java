public class lastoccurence {
    public static void main(String[] args) {
        int arr[]={3,4,13,13,20,40};
        int n=arr.length;
        int x=13;
        int ind=last(arr,n,x);
        System.out.println();
        System.out.println(ind);
        
        
    }

    private static int last(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
                }
                else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
