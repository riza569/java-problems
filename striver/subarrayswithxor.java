public class subarrayswithxor {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int x=6;
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xor=0;
                for(int k=i;k<=j;k++){
                    xor=xor^arr[k];
                }
                if (xor==x){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
