public class leftrotate3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,78};
        int d=3;
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-n+d];
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
  }
}
