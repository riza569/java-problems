public class maxprodsubarray {
    public static void main(String[] args) {
        int arr[]={1,3,-5,6,3,2,-8,-9,10,-12,-15};
        int n=arr.length;
        int max=product(arr,n);
        System.out.println();
        System.out.print("maximum subarrya is "+max);
    }

    private static int product(int[] arr, int n) {
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix*=arr[i];
            suffix*=arr[n-i-1];
            max=Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}
