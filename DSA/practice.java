public class practice {

    public static void main(String[] args) {
        int arr[]={55,23,34,4,55,4,66,77,88};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=4 && arr[j]==4){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=4){
                j++;
        }
    }
    for(int x:arr)
    System.out.print(x+" ");
}}