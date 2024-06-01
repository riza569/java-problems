import java.util.HashMap;

public class subarrayswithxor2 {
    public static void main(String[] args) {
        int arr[]={4, 2, 2, 6, 4};
        int n=arr.length;
        int k=6;
        int cnt=0;
        HashMap<Integer,Integer>hmm=new HashMap<>();
        hmm.put(0,1);
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
            int x=xor^k;
            if(hmm.containsKey(x)){
                cnt+=hmm.get(x);
            }
            if(!hmm.containsKey(xor)){
                hmm.put(xor, 1);
            }
            else{
                hmm.put(xor, hmm.get(xor)+1);
            }
        }
        System.out.println(cnt);
    }
}
