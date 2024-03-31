public class arraysortedcheck {
    public static boolean sortedcheck(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) {
        int arr[]={12,13,1,15,16};
        System.out.println(sortedcheck(arr));
    }
}
