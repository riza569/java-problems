import java.util.ArrayList;

public class revpair {
    public static void main(String[] args) {
        int arr[]={4, 1, 2, 3, 1};
        int n=arr.length;
        int cnt=noofrev(arr,n);
        System.out.println(cnt);
        
}

    private static int noofrev(int[] arr, int n) {
        return mergesort(arr,0,n-1);
    }

    private static int mergesort(int[] arr, int low, int high) {
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergesort(arr, low, mid) ;
        cnt+=mergesort(arr, mid+1, high);
        cnt+=countpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return cnt;

    }

    private static int countpairs(int[] arr, int low, int mid, int high) {
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high&&arr[i]>2*arr[right])right++;
            cnt+=(right-(mid+1));
        }

        return cnt;

    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left=low;
        int right=mid+1;
        ArrayList<Integer>temp=new ArrayList<>();
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;

            }            
            
            }
                while (left <= mid) {
                    temp.add(arr[left]);
                    left++;
                }
                while (right <= high) {
                    temp.add(arr[right]);
                    right++;
                }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }

}
