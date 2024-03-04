public class shiftnumbertoright{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,7,2,8,9,1};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=2 && arr[j]==2){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=2){
                j++;
            }
        }
        for(int x:arr){
            System.out.print(x);
        }
    }
}