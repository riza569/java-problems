public class minimumvalue {
    public static void main(String[] args) {
        int arr[]={5,4,3,7,8,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.print("\nmin element is "+min);
    }
}
