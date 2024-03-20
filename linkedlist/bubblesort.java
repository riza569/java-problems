public class bubblesort{

    
    public static void main(String[] args) {
        int arr[]={55,33,1,7,100,8};
        int low=0;
        int high=arr.length-1;
        int temp[]=new int[arr.length];
        mergesort(arr,temp,low,high);
        for(int x:arr)
        System.out.print(x+" ");

    }

    private static void mergesort(int[] arr,int[]temp, int low, int high) {
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr,temp, low, mid);
            mergesort(arr,temp, mid+1,high);
            merge(arr,temp,low,mid,high);

        }
    }

    private static void merge(int[] arr,int temp[], int low, int mid, int high) {
       for(int i=low;i<=high;i++ ){
        temp[i]=arr[i];
       }
       int i=low,j=mid+1,k=low;
       while(i<=mid && j<=high){
        if(temp[i]<=temp[j])
        {
            arr[k]=temp[i];
            i++;
        }
        else{
            arr[k]=temp[j];
            j++;
        }
        k++;
       }

       while(i<=mid){
        arr[k]=temp[i];
        i++;
        k++;
       }
    }

}