public class rotatebyk {
    public static void rotateleftbyk(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];//temp[]={3,2,5}
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];//67,8,10,14,8,10,14
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        

    }
    public static void rotaterightbyk(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)]=arr[i];//temp[]={10,14}
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];//3,2,3,2,5,67,8
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }

    }
    public static void main(String[] args) {
        int arr[]={3,2,5,67,8,10,14};
        int k=2;
        // rotateleftbyk(arr, k);
        rotaterightbyk(arr, k);
        for(int x:arr)
        System.out.print(x+" ");

    }
}
