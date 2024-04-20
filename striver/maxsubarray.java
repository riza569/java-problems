public class maxsubarray {
    public static void main(String[] args) {
        int arr[]={1,-4,3,-5,3,2,6,-4,6};
        int n=arr.length;
        int sum=0;
        int start=0;
        int ans_start=-1;
        int ans_end=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum==0)
            start=i;

            sum+=arr[i];
            
            if(sum>max){
                max=sum;
                ans_start=start;
                ans_end=i;
            }

            if(sum<0){
            sum=0;
           
        }
    }
        System.out.println("sum found from "+ ans_start+" to "+ans_end);
        System.out.println(sum);

}
}