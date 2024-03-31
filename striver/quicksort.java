public class quicksort {
    public static void main(String[] args) {
        int arr[]={44,3,77,1,10,99};
        int n=arr.length-1;
        quicksort(arr,0,n);
        for(int x:arr)
        System.out.print(x+" ");
    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low<high){
        int partition_ind=partition(arr,low,high);
        quicksort(arr, low, partition_ind-1);
        quicksort(arr,partition_ind+1 , high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
             int pivot=arr[low];
             int i=low;
             int j=high;
            while(i<j){
                while(arr[i]<=pivot&&i<=high-1){
                    i++;
                }
                while(arr[i]>pivot&&j>=low+1){
                    j--;
                }
                if(i<j)swap(arr, i, j);
            }
                
            swap(arr, low, j);
            return j;
 }

    private static void swap(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
