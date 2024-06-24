public class koko {
    public static void main(String[] args) {
        int arr[]={7, 15, 6, 3};
        int h=8;
        int ans=koko(arr,h);
        System.out.println();
        System.out.println(ans);
    }

    private static int koko(int[] arr, int h){
        int low=1;
        int high=findmax(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            int minimhr=totalhr(arr,mid);
            if(minimhr<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }

    private static int totalhr(int[] arr, int mid) {
        int totalhr=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalhr+=Math.ceil((double)arr[i]/mid);
        }
        return totalhr;
    }

    private static int findmax(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }


}
