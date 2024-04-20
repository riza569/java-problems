public class buystock {
    public static void main(String[] args) {
        int arr[]={3,2  ,6,10,15};
        int n=arr.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        int cost=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            cost=arr[i]-min;
            max=Math.max(max, cost);
        }
        System.out.println(max);
    }
}
