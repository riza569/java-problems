public class occurences {
    public static void main(String[] args) {
        int arr[]={2, 2 , 3 , 3 , 3 , 3 ,3, 4};
        int n=arr.length;
        int ele=3;
    int first_index=first(arr,n,ele);
    int last_index=last(arr,n,ele);
    int noofoccurence=(last_index-first_index)+1;
    System.out.println();
    System.out.println(noofoccurence);
        }

    private static int first(int[] arr, int n, int ele) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==ele){
                high=mid-1;
                ans=mid;
            }
            else if(arr[mid]>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
  }

    private static int last(int[] arr, int n, int ele) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==ele){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
