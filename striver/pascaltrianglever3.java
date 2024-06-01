import java.util.ArrayList;
import java.util.List;

public class pascaltrianglever3 {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> ans=pascaltriangle(6);
        for(List<Integer>it:ans){
            for(int x:it){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        
    }
    public static List<List<Integer>>pascaltriangle(int n){
        
        List<List<Integer>>ans=new ArrayList<>();
        for(int row=0;row<=n;row++){
            List<Integer>templis=new ArrayList<>();
            for(int col=1;col<=row;col++){
                templis.add(ncr(row-1,col-1));
            }
            ans.add(templis);
        }
        return ans;
    }
    private static Integer ncr(int n, int r) {
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
