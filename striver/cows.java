import java.util.Arrays;

public class cows {
   public static void main(String[] args) {
    int arr[]={0,3,4,7,10,9};
    int k=4;
    int max=calcmindistance(arr,k);
    System.out.println();
    System.out.println(max);
   }

private static int calcmindistance(int[] arr, int k) {
    Arrays.sort(arr);
    int n=arr.length;
    int limit=arr[n-1]-arr[0];
    for(int i=1;i<=limit;i++){
        if(canweput(arr,i,k)==true){
            continue;
        }
        else{
            return i-1;
        }
    }

    int low=1;
    int high=limit;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(canweput(arr, mid, k)==true){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return high;
}

private static boolean canweput(int[] arr, int dist, int k) {
    int cntcow=1;
    int last=arr[0];
    int n=arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]-last>=dist){
            cntcow++;
            last=arr[i];
        }
        if(cntcow>=k)return true;
    }
    return false;
}

}
