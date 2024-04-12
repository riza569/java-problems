public class zeroonetwo{
    public static void main(String[] args) {
        int arr[]={1,2,0,2,0,1,2,0,1};
                 //0,0,0,1,1,1,2,2,2
        int left=0;
        int n=arr.length;
        int right=n-1;
        for(int i=0;i<n&&i<=right;){
            if(arr[i]==2){
                swap(arr,i,right);
                right--;
            }

            else if(arr[i]==0){
                swap(arr,left,i);
                left++;
                i++;
            }

            else{   
                i++;
            }
        }
        for(int x:arr)
        System.out.print(x+" ");
    }

    private static void swap(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    }
