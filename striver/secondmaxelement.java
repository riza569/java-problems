public class secondmaxelement {
    public static void main(String[] args) {
        int arr[]={14,16,22,17,55,102,44};
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i] );
            min=Math.min(min,arr[i]);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<second_min&&arr[i]!=min){
                second_min=arr[i];
            }
            if(arr[i]>second_max&&arr[i]!=max){
                second_max=arr[i];
            }
        }
        System.out.println(second_max);
        System.out.println(second_min);
    }
}
