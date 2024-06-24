public class mindivisor {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int limit=8;
        int ans=divisor(arr,limit);
        System.out.println();
        System.out.println(ans);
        
    }

    private static int divisor(int[] arr, int limit) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        for(int d=1;d<=max;d++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=Math.ceil((double)arr[i]/(double)d);
                
                }
            if(sum<=limit)return d;
        }
        return -1;
    }

}
