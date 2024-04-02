public class rotatebyk2 {
    public static void main(String[] args) {
        int arr[]={11,44,33,15,66,78};
        int k=2;
        // rotaterightbyk(arr,k);
        // for(int x:arr)
        // System.out.print(x+" ");
        rotateleftbyk(arr, k);
        // System.out.println();
        for(int x:arr)
        System.out.print(x+" ");
    }
    public static void rotaterightbyk(int arr[],int k){
        int n=arr.length;
        reverse(arr,n-k,n-1);//o(k)
        reverse(arr,0,n-k-1);//o(n-k)
        reverse(arr,0,n-1);//o(n)------------------>total TC:->o(2n)
    } 
    
    public static void rotateleftbyk(int arr[],int k){
        int n=arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    } 
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
