public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,255};
        int searchkey=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchkey){
                System.out.println(arr[i]+" is found");
                break;
            }
        }
    }
}
