public class movezerotoend2 {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,0,4,0,5,10};
        int n=arr.length;
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0&&arr[j]==0){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     }

        //     if(arr[j]!=0){
        //         j++;
        //     }

        // }
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                 j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x:arr)
        System.out.print(x+" ");
    }
}
