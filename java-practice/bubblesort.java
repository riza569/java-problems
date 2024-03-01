
public class bubblesort {
   public static void main(String[] args) {
   int arrays[]={6,5,2,8,9,4};
   System.out.println("Before sorting");
   for(int arr:arrays){
       System.out.print(arr + " ");
    }

    for(int i=0;i<arrays.length;i++){
        for(int j=0;j<arrays.length-i-1;j++){
            if(arrays[j]>arrays[j+1]){
                int temp=arrays[j];
                arrays[j]=arrays[j+1];
                arrays[j+1]=temp;
            }
        }
    }
    System.out.println();
    System.out.println("after sorting");
   for(int arr:arrays){
    System.out.print(arr + " ");
   }





   }

}
