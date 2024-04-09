public class missingnumber1{
    //only for sorted array
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]+1!=arr[i]){
                System.out.println(arr[i-1]+1);
                break;
            }
        }
    }
}