public class insertionsort {
    public static void main(String[] args) {
        int arr[]={3,7,4,1,8,9,10};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
        
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
