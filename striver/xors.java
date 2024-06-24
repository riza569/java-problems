import java.util.HashMap;

public class xors {
    public static void main(String[] args) {
        int arr[]={4, 2, 2, 6, 4};
        int k=6;
        int ans=xorss(arr,k);
        System.out.println();
        System.out.println(ans);
        
    }

    private static int xorss(int[] arr, int k) {
        int n=arr.length;
        int cnt=0;
        HashMap<Integer,Integer>hmm=new HashMap<>();
        int xr=0;
        hmm.put(xr, 1);
        for(int i=0;i<n;i++){
            xr^=arr[i];
            int x=xr^k;
            if(hmm.containsKey(x)){
                cnt+=hmm.get(x);
            }
            
            else{
                hmm.put(xr, hmm.getOrDefault(xr, 0)+1);
            }

        }
        return cnt;
    }
}
