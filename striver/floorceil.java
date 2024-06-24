public class floorceil {
    public static void main(String[] args) {
        int arr[]={3, 4, 4, 7, 8, 10};
        int x=7;
        int n=arr.length;
        int ans[]=getfloorceil(arr,n,x);
        System.out.println("floor is "+ans[0]+" and ceil is "+ans[1]);


    }
    private static int[] getfloorceil(int[] arr, int n, int x) {
        int a=floor(arr, n, x);
        int b=ceil(arr, n, x);
        return new int[]{a,b};
    }
    public static int ceil(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int floor(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                low=mid+1;
                }
                else{
                high=mid-1;
            }
        }
        return ans;
    }
}
