public class bubblesort {
    public static void main(String[] args) {
        int array[]={5,1,4,7,8,10,2};
        int n=array.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
