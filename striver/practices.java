public class practices {

    public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int k=4;
        int missing=calcmissing(arr,k);
        System.out.println();
        System.out.println(missing);
    }

    private static int calcmissing(int[] arr, int k) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int low=1;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-mid+1;
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
}