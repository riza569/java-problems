public class secondmaximumvalue {
 
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int arr[]={22,44,66,55,44,12,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println("second max element is "+ secondmax);
    }}