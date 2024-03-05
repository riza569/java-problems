// public class zeroonetwosort {
//     public static void main(String[] args) {
//         int arr[]={1,2,0,2,1,2,0};
//         int l=0;
//         int n=arr.length;
//         int h=n-1;
//         for(int i=0;i<n && i<=h;){
//             if(arr[i]==0){
//                 swap(arr,l,i);
//                 l++;
//                 i++;
//             }
//             else if(arr[i]==2){
//                 swap(arr,h,i);
//                 h--;
//             }
//             else{
//                 i++;
//             }

//         }
//         for(int x:arr)
//         System.out.print(x+" ");
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }


public class zeroonetwosort{
    public static void main(String[] args) {
        int arr[]={1,2,1,2,0,1,0,1,2};
        int l=0;
        int r=arr.length-1;
        for(int i=0;i<arr.length && i<=r;){
            if(arr[i]==0){
                swap(arr,l,i);
                i++;
                l++;
            }
            else if(arr[i]==2){
                swap(arr,r,i);
                r--;
            }
            else{
                i++;
            }
        }
        for(int x:arr)
        System.out.print(x+" ");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
   
}