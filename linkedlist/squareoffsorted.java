public class squareoffsorted {
    public static void main(String[] args) {
        int arr[]={-18,-3,-1,3,7,9,13};
        int n=arr.length;
        int res[]=new int[n];
        int left=0;
        int right=n-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                res[k]=arr[right]*arr[right];
                right--;
            }else{
                res[k]=arr[left]*arr[left];
                left++;
                
            }
        }
        for(int x:res){
            System.out.print(x+" ");
        }

    }
}
