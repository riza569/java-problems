public class nextpermu {
    public static void main(String[] args) {
        int arr[]={3,2,1};
                // 2,3,5,4,1,0,0
        int n=arr.length;
        int index=0 ;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                index=i;
                break;
            }
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }
            reverse(arr,index+1,n-1);
            for(int x:arr){
                System.out.print(x+" ");
            }
        

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverse(int arr[],int low,int high){
        while(low<=high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
}
