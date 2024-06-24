public class rotataedandsorted {
    public static void main(String[] args) {
        int arr[]={5,1,3};
        int target=3;
        int n=arr.length;
        int ind=search(arr,n,target);
        System.out.println("the index is "+ind);
        
    }

    private static int search(int[] arr, int n, int target) {
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
             if(arr[low]<=arr[mid]){
                if(arr[low]<=target&&target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=target&&target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
