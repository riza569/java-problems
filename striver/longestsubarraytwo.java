import java.util.HashMap;

public class longestsubarraytwo {
    public static void main(String[] args) {
        int arr[]={1, 3, -5, 6, -2};
        int n=arr.length;
        int largest=largest(arr,n);
        System.out.println(largest);
        

    }

    private static int largest(int[] arr, int n) {
        int max=0;
        int sum=0;
        HashMap <Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(hm.get(sum)!=null){
                    max=Math.max(max,i-hm.get(sum));
                }
                else{
                    
                    hm.put(sum, i);
                }
            }
        }


        return max;
    }
}
