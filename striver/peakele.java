public class peakele {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        int n=arr.length;
        int ind=peak(arr,n);
        System.out.println();   
        System.out.println(ind);
    }

    private static int peak(int[] arr, int n) {
        
        for(int i=0;i<n;i++){

        if(i==0||arr[i]>arr[i+1]&&i==n-1||arr[i]>arr[i-1])
            return i;
        }
        return -1;
    }
}
