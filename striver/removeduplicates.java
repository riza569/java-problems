import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={1,3,3,5,5,9};
        //1,3,5,9
        int k=removeduplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeduplicates(int arr[]){
        int i=0;//i=3
                //j=5
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
