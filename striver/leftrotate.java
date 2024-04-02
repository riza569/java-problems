public class leftrotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
//TIME COMPLEXITY 0(N)
//SPACE COMPLEXITY 0(1)


