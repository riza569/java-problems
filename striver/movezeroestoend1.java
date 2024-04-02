import java.util.ArrayList;

//BRUTEFORCE APPROACH

public class movezeroestoend1 {
    public static void main(String[] args) {
        int arr[]={1,0,3,4,0,2,0};
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz=temp.size();
        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);
        }
        for(int i=nz;i<arr.length;i++){
            arr[i]=0;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
