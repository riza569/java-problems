public class nextperm {
    public static void main(String[] args) {
        int arr[]={1,3,2};
        int n=arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }

        }

        if(index==-1){
            reverse(arr,0,n-1);
        }

        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }
        reverse(arr,index+1,n-1);
        for(int x:arr)System.out.print(x+" ");
    }

    private static void reverse(int[] arr, int low, int high) {
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}