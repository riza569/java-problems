public class sortedarray {
    public static boolean sorted(int arr[],int index){
        if(index==arr.length-1)
            return true;
        

        if(arr[index]<arr[index+1]){
          return sorted(arr, index+1);
        }
        else
            return false;
        
    }
    public static void main(String[] args) {
        int array[]={1,3,3,4,5};
        System.out.println(sorted(array, 0));
    }
}
