public class insertionsort {
    public static void main(String[] args) {
        
        int array[]={5,1,3,9,10,2};
        for(int arr:array){
            System.out.print(arr+" ");
        }

        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;

        }
        for(int arr:array){
            System.out.print(arr+" ");
        }
    }
}