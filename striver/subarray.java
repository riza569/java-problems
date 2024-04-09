import java.util.HashMap;

public class subarray {

    // public static void main(String[] args) {
    //     int arr[]={2,3,4,5,9,13,14};
    //     int sum=9;
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         int s=0;
    //         for(int j=i;j<arr.length;j++){
    //             s+=arr[j];
    //             if(sum==s){
    //                 max=Math.max(max,j-i+1 );
    //             }
    //         }
    //     }
    //     System.out.println(max);
    // }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6,9};
        int sum=0;
        int maxlen=0;
        int k=9;
        HashMap<Integer,Integer>gm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==k){
                maxlen=Math.max(maxlen, i+1);
            }
            int rem=sum-k;
            if(gm.containsKey(rem)){
                int len=i-gm.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!gm.containsKey(sum)){
                gm.put(sum, i);
            }

        }
        System.out.println(maxlen);
    }
}