public class missingnumber2 {
    public static int missing(int arr[]){

        int hash[]=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=arr.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,1,3};
        System.out.println(missing(arr));
}
}