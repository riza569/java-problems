public class maxminorder {
    public static void main(String[] args) {
        int arr[]={2,4,11,14,22,28,33};
        int n=arr.length;
        int min_index=0;
        int max_index=n-1;
        int max=arr[n-1]+1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max_index]%max)*max;
                max_index--;
            }else{
            arr[i]=arr[i]+(arr[min_index]%max)*max;
            min_index++;
        }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/max;
        System.out.print(arr[i]+" ");
        }
    }
}

