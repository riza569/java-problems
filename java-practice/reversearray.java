public class reversearray {
    public static void swap(int array[],int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void reverse(int array[],int left,int right){
        if(left>=right){
           for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
           };
           return;
        }
       swap(array,left,right);
       reverse(array, left+1, right-1);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        reverse(array, 0, array.length-1);
    }
}
