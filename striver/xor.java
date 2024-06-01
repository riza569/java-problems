import java.util.HashMap;

public class xor {
    public static void main(String[] args) {
        int k=6;
        int arr[]={4,2,2,6,4};
        int ans=xorr(arr, k);
        System.out.println(ans);

    }
    public static int xorr(int arr[],int target){
        int n=arr.length;
        int xr=0;
        HashMap<Integer,Integer>hmm=new HashMap<>();
        hmm.put(xr,1);
        int cnt=0;
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            int x=xr^target;
            if(hmm.containsKey(x))
            cnt+=hmm.get(x);

            if(hmm.containsKey(xr))
            hmm.put(xr,hmm.get(xr)+1);
            else{
                hmm.put(xr, 1);
            }
        }
        return cnt;

        
    }
}
