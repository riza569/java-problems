public class maxelement{
    public static void second_largest(int arr[]){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            if(arr[i]>second_max&&arr[i]!=max){
                second_max=arr[i];
            }
                       
        }
        System.out.println(second_max);
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,8,10,44,11};
        second_largest(arr);
        second_smallest(arr);
        
    }
    private static void second_smallest(int[] arr) {
        int small=Integer.MAX_VALUE; 
        int second_small=Integer.MAX_VALUE; 
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                second_small=small;
                small=arr[i];
            }
            if(arr[i]<second_small&&arr[i]!=small){
                second_small=arr[i];
            }
        }
        System.out.println("second smallest element is "+second_small);
    }
}