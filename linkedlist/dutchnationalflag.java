public class dutchnationalflag {
    public static void main(String[] args) {
        int arr[]={2,1,2,0,1,0,1,0,1,2};
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length&&i<=right;){
            
            if(arr[i]==2){
                swap(arr,i,right);
                right--;
            }

            else if(arr[i]==0){
                swap(arr, i, left);
                left++;
            }

            else{
                i++;
          }
        }

        for(int x:arr){
            System.out.print(x+" ");
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
