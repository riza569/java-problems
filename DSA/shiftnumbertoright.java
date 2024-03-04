public class shiftnumbertoright {
    public static void main(String[] args) {
        int array[]={1,2,3,0,5,0,7,0,2};
        int n=array.length;
        int j=0;
        for(int i=0;i<n;i++){
         if(array[i]!=0&&array[j]==0){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
         }
         if(array[j]!=0){
            j++;
         }
    }
    for(int x:array){

        System.out.print(x);
    }
}}
