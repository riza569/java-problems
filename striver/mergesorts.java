
//bubble sorrt 
//selection sort
//insertion sort
public class mergesorts {
       public static void main(String[] args) {
        int arr[]={15,22,155,1,34,2};
        int n=arr.length-1;
        mergesort(arr,0,n);
        for(int x:arr)
        System.out.print(x+" ");
    }
     public static void  mergesort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
         int mid=low+(high-low)/2;
         mergesort(arr, low, mid);
         mergesort(arr, mid+1, high);
         merge(arr,low,mid,high);
           }
    private static void merge(int[] arr, int low, int mid, int high) {
        int temp[]=new int[arr.length];
        int left=low;
        int right=mid+1;
        int i=low;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                 temp[i]=arr[left];
                 left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        } 
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp[j];
        }
      }
}
