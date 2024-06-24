public class bouque {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;
        int days=noofdays(arr,m,k);
        System.out.println();
        if(days==-1)
        System.out.println("nope");
        else
        System.out.println(days);
    }

    private static int noofdays(int[] arr, int m, int k) {
        int n=arr.length;
        long val=(long)m*k;
        if(val>n)return -1;
        int min=findmin(arr);
        int max=findmax(arr);
        int low=min;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(arr, mid, m, k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
        
    }

    private static boolean possible(int[] arr, int day, int m, int k) {
        int n=arr.length;
        int cnt=0;
        int bs=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                bs+=(cnt/k);
                cnt=0;
                }
                }
        bs+=(cnt/k);
        return bs>=m;
    }

    private static int findmax(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }

    private static int findmin(int[] arr) {
        int n=arr.length;
        int min=0;
        for(int i=0;i<n;i++){
            min=Math.min(min, arr[i]);
        }
        return min;
    }
}
