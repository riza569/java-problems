public class consecutive1s {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,1,1};
        int flag=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                flag++;//flag=3
            }
            else{
                flag=0;//flag=0
            }
            maxi=Math.max(flag,maxi);//maxi=3
        }
        System.out.println(maxi);   
    }
}
