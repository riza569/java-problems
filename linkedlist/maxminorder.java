public class maxminorder {
    public static void main(String[] args) {
        int arr[]={2,4,18,14,22,28,33};
        int n=arr.length;
        int end=n-1;
        for(int i=1;i<n;i=i+2){
            int high=arr[end];
            int k=end;
            while(k>=i){
                arr[k]=arr[k-1];
                k--;
            }
            arr[i-1]=high;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
