public class missing {
    public static void main(String[] args) {
        int arr[]={4,7,9,10};
        int k=4;
        for(int i=0;i<4;i++){
            if(arr[i]<=k){
                k++;
            }else break;
        }
        System.out.println();
        System.out.println(k);
    }
}
