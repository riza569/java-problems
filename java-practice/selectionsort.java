public class selectionsort {
    public static void main(String[] args) {
       int array[]={6,5,2,8,9,4};
       System.out.println("before sorting");
       for(int arr : array){
        System.out.print(arr+" ");
       }
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }

                
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }



        System.out.println();
       System.out.println("after sorting");
       for(int arr : array){
       System.out.print(arr+" ");
       }
    }
}
