import java.util.ArrayList;

public class inversions {
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        int n=arr.length;
        int cnt=noofinversion(arr,n);
        System.out.println(cnt);
        
    }
    private static int noofinversion(int[] arr, int n) {

        return mergesort(arr, 0, n-1);
    }
    public static int mergesort(int arr[],int low,int high){
        int cnt=0;
        if(low>=high)return cnt;
        int mid=(low+high)/2;
        cnt+=mergesort(arr, low, mid);
        cnt+=mergesort(arr, mid+1, high);
        cnt+=merge(arr,low,mid,high);
        return cnt;
    }
    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                cnt+=mid-left+1;
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
        }
        while(right<=high){
            temp.add(arr[right]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        return cnt;
    }
}
