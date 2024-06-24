import java.util.HashMap;

public class zerosum {
    public static void main(String[] args) {
        int arr[]={6, -2, 2, -8, 1, 7, 4, -10};
        int n=arr.length;
        int ans=subarray(arr,n);
        System.out.println();
        System.out.println(ans);
    }

    private static int subarray(int[] arr, int n) {
        int max=0;
        int sum=0;
        HashMap<Integer,Integer>hmm=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)max=i+1;
            else{
            if(hmm.containsKey(sum)){
                max=Math.max(max,i-hmm.get(sum));
            }
            else{
                hmm.put(sum, i);
            }
        }
    }
        return max;
    }
}
