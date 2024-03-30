public class recursivebubbblesort {
    public static void recbubble(int arr[],int n){
        if(n==1){
            return;
        }
        int didswap=0;
        for(int j=0;j<n-2;j++){
            if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
            }
        }
        recbubble(arr, n-1);
    } 
    public static void main(String[] args) {
        int arr[]={55,33,2,1,66};
        recbubble(arr, arr.length);
        for(int x:arr){
            System.out.print(x+" " );
        }
    }
}
