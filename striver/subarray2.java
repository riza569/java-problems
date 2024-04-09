public class subarray2 {
    public static void main(String[] args) {
        int a[]={1,2,3,3,4,5,9,13};
        int n=a.length;
        int start=0;
        int end=0;
        int sum=9;
        int currentsum=a[0];
        int maxlen=0;
        while(end<n){
            while(start<=end&&currentsum>sum){
                sum-=a[start];
                start++;
            }

            if(sum==currentsum){
                maxlen=Math.max(maxlen,end-start+1);
            }

            end++;

            if(end<n){
                currentsum+=a[end];
            }
            
        }
        System.out.println(maxlen);
        
}
}
