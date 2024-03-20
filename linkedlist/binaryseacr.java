public class binaryseacr{

    public static void main(String[] args) {
        int arr[]={133,33,44,55,66,777,88,99};
        int search=777;
        int low=0;
        int high=arr.length-1;
        System.out.println(binarysearch(arr,low,high,search));


    }

    private static int binarysearch(int[] arr, int low, int high, int search) {
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==search) return mid;
             if(arr[mid]<search){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
}